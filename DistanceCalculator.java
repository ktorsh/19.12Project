import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.stream.Stream;

public class DistanceCalculator {
	private static final double RADIUSOFEARTH = 3959; //in miles
	
	private static double calculateDistance(City a, City b){
		double aLatitude = a.getLatitude()/(180/Math.PI);
		double aLongitude = a.getLongitude()/(180/Math.PI);
		
		double bLatitude = b.getLatitude()/(180/Math.PI);
		double bLongitude = b.getLongitude()/(180/Math.PI);
		
		return RADIUSOFEARTH * Math.acos(Math.sin(aLatitude) * Math.sin(bLatitude) + Math.cos(aLatitude) * Math.cos(bLatitude) * Math.cos(bLongitude - aLongitude));
	}
	
	public static Object[] filterCities(double lat, double lon, double distance){
		FileReader fr = null;
		BufferedReader br = null;
		Stream<String> lines = null;
		try {
			fr = new FileReader("worldcities.csv");
			br = new BufferedReader(fr);
			lines = br.lines();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Stream<City> cities = lines.map(line -> processEachLine(line, lat, lon, distance)).filter(city -> city.getName().length() > 0).sorted();
		return cities.toArray();
	}
	
	private static City processEachLine(String line, double lat, double lon, double distance) {
		City comparingLocation = new City("", lon, lat);
		String[] cityInfo = line.split(",");
		City currentCity = new City(cityInfo[1], Double.parseDouble(cityInfo[3]), Double.parseDouble(cityInfo[2]));
		double currentDistance = calculateDistance(comparingLocation, currentCity);
		if (currentDistance < distance) {
			currentCity.setName(Double.toString(currentDistance) + " " + currentCity.getName() + ", " + cityInfo[7] + ", " + cityInfo[4]);
			currentCity.setDistance(currentDistance);
		}else {
			currentCity.setName("");
		}
		return currentCity;
	}
}

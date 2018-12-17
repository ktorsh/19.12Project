import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DistanceCalculator {
	private ArrayList<City> cities;
	private int distance;
	private String databasePath;
	
	public DistanceCalculator(int d){
		cities = new ArrayList<City>();
		distance = d;
		databasePath = "worldcities.csv";
	}
	private void parseThroughFile(){
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(databasePath);
			br = new BufferedReader(fr);
			
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		

		

	}
	
	private int haversine(int lat1, int long1, int lat2, int long2){
		return distance;
	}

}

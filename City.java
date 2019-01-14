
public class City implements Comparable<City>{
	private String name;
	private double lon; //longitude
	private double lat;  //latitude
	private double distance;
	
	public City(String n, double lo, double la){
		name = n;
		lon = lo;
		lat = la;
	}
	
	public double getLongitude() {
		return lon;
	}
	
	public double getLatitude() {
		return lat;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name;
	}
	
	public void setDistance(double d) {
		distance = d;
	}
	
	public void setName(String n) {
		name = n;
	}

	@Override
	public int compareTo(City arg0) {
		if (distance - arg0.distance > 0) {
			return 1;
		}else if (distance - arg0.distance < 0) {
			return -1;
		}
		return 0;
	}
	
}

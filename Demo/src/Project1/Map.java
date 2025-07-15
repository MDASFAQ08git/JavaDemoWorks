package Project1;
import java.util.*;


public class Map {

	public static void main(String[] args) {
		
//		HashMap<String,String> country = new HashMap<String,String>();
//		country.put("uk","London");
//		country.put("India","New Delhi");
//		country.put("UAE","Dubai");
//		country.put("Saudi","Bukrain");
//		country.put("Qatar","Bukrain");
//		country.replace("UAE","DubaiMainRoad");
//		country.remove("uk");
//		System.out.println(country.get("UAE"));
//		System.out.println(country);
//		
//		LinkedHashMap<String,String> country = new LinkedHashMap<String,String>();
//		country.put("uk","London");
//		country.put("India","New Delhi");
//		country.put("UAE","Dubai");
//		country.put("Saudi","Bukrain");
//		country.put("Qatar","Bukrain");
//		country.replace("UAE","DubaiMainRoad");
//		country.remove("uk");
//		System.out.println(country.get("UAE"));
//		System.out.println(country);
//		
		TreeMap<String,String> country= new TreeMap<String,String>();
		country.put("uk","London");
		country.put("India","New Delhi");
		country.put("UAE","Dubai");
		country.put("Saudi","Bukrain");
		country.put("Qatar","Bukrain");
		country.replace("UAE","DubaiMainRoad");
		country.remove("uk");
		System.out.println(country.get("UAE"));
		System.out.println(country);

	}

}

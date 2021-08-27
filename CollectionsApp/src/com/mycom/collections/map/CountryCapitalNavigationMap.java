package com.mycom.collections.map;
import java.util.HashMap;
import java.util.Set;
public class CountryCapitalNavigationMap {

	public static void main(String[] args) {
		
		HashMap<String,String> capitalCities=new HashMap<String,String>();
       capitalCities.put("England","London");
       capitalCities.put("Germany","Berlin");
       capitalCities.put("Norway","Oslo");
       capitalCities.put("USa","DC");
       capitalCities.put("Norway","Oslo");
       
       System.out.println(capitalCities.get("England"));
       System.out.println(capitalCities.get("Norway"));
       
       capitalCities.put("india","new delhi");
       //keyset() -returns all keys as set object
       
       Set<String> keys=capitalCities.keySet();
        // keys ---> [england,germany,norway,usa]
       
       System.out.println("the values using get(key) method are ");
       //set keys =capitalcities.keyset()
       for(String key:capitalCities.keySet()) {
    	   System.out.println("key:"+key +"value: "+ capitalCities.get(key) );
       }
       
	}

}

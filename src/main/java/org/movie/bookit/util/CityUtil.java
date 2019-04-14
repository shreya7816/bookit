package org.movie.bookit.util;

import java.util.ArrayList;
import java.util.List;

import org.movie.bookit.model.City;

public class CityUtil {

	public static List<City> getAllCities(){
		List<City> citiesList = new ArrayList<City>();
		City Delhi = new City(1,"Delhi","Delhi","India","IN",true);
		City Jaipur = new City(2,"Jaipur", "Rajasthan", "India","IN", true);
		citiesList.add(Delhi);
		citiesList.add(Jaipur);
		return citiesList;
		
	}
}

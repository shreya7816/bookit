package org.movie.bookit.manager;

import java.util.List;

import org.movie.bookit.model.City;
import org.springframework.stereotype.Service;
import org.movie.bookit.util.CityUtil;

@Service
public class CitySearchManager {

	public List<City> getLaunchCities() {
		return CityUtil.getAllCities();
	}
}

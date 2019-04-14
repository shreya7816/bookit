package org.movie.bookit.controllers;

import org.movie.bookit.manager.CitySearchManager;
import org.movie.bookit.request.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/search")
public class SearchController {
	
	@Autowired
	CitySearchManager citySearchManager;
	
	@GetMapping(
			value = "/cities",
			
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE
			)
	public ResponseEntity<?> searchCities(SearchRequest searchRequest){
		return new ResponseEntity<>(citySearchManager.getLaunchCities(), HttpStatus.OK);
	}
	
}

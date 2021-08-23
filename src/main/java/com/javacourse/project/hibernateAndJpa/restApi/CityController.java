package com.javacourse.project.hibernateAndJpa.restApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacourse.project.hibernateAndJpa.Business.*;
import com.javacourse.project.hibernateAndJpa.Entities.*;
import com.javacourse.project.hibernateAndJpa.Exception.ResourceNotFoundException;

import java.util.*;
@RestController
@RequestMapping("/api")
public class CityController {

	private ICityService cityService;

	@Autowired
	public CityController(ICityService cityService) {

		this.cityService = cityService;
	}
	@GetMapping("/cities")
	public List<City> get(){
		
		return cityService.getAll();
	}
	
	@GetMapping("/cities/{id}")
	public City getById(@PathVariable Long id){
		
		return this.cityService.getById(id)
				.orElseThrow(() -> new ResourceNotFoundException("City not found :" + id) );
				
	}
	
	@PostMapping("/addCity")
	public boolean addCity(@RequestBody City city){
		
		cityService.add(city);
		return true;
	}
	
	@PostMapping("/updateCity")
	public boolean updateCity(@RequestBody City city){
		
		cityService.update(city);
		return true;
	}
	@PostMapping("/deleteCity")
	public boolean deleteCity(@RequestBody City city){
		
		cityService.delete(city);
		return true;
	}
	
	

	
}

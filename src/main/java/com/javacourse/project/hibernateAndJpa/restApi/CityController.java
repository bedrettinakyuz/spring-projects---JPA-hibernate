package com.javacourse.project.hibernateAndJpa.restApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.javacourse.project.hibernateAndJpa.Business.*;
import java.util.*;
import com.javacourse.project.hibernateAndJpa.Entities.*;
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
		
		return cityService.getById(id);
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

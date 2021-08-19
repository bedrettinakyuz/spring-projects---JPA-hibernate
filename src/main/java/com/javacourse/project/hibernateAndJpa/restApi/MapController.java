package com.javacourse.project.hibernateAndJpa.restApi;
import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.FetchType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.javacourse.project.hibernateAndJpa.Business.*;
import com.javacourse.project.hibernateAndJpa.Dtos.*;
import com.javacourse.project.hibernateAndJpa.Entities.City;
import com.javacourse.project.hibernateAndJpa.Entities.User;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;@RestController
@RequestMapping("/map")
public class MapController {

	
	@Autowired
	private IMapService mapService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private EntityManager entityManager;
	
	@GetMapping("/getUser")
	@ResponseBody
	public List<UserLocationDTO> getAllUsersLocation(){
	List<UserLocationDTO> userLocation = mapService.getAllUserLocation();
	return userLocation;
	}


    @PostMapping("/addUser")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    
    public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO UserDTO)
    {
    	
    	modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    	User userRequest = modelMapper.map(UserDTO, User.class);
    	//Hibernate will create the proxy containing only the id without going to the database.	
    	//use the proxy for the city
    	userRequest.setCity(entityManager.getReference(City.class, UserDTO.getCityID()));
    	mapService.addUser(userRequest);
    	UserDTO userResponse = modelMapper.map(userRequest, UserDTO.class);
    	return new ResponseEntity<UserDTO>(userResponse,HttpStatus.CREATED);
    }
    



} 

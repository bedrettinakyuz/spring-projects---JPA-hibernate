package com.javacourse.project.hibernateAndJpa.Business;


import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.javacourse.project.hibernateAndJpa.AppConfig;
import com.javacourse.project.hibernateAndJpa.Dtos.*;
import com.javacourse.project.hibernateAndJpa.Repositories.UserRepository;
import java.util.*;
import java.util.stream.Collectors;
import com.javacourse.project.hibernateAndJpa.Entities.*;

@Service
public class MapService implements IMapService {


	@Autowired
	private IUserService userService;

	public List<UserLocationDTO> getAllUserLocation(){

		
		return((List<User>)  userService
				.getAll())
				.stream()
				.map(this::convertToUserLocationDTO)
				.collect(Collectors.toList());
	}
	
	
	private UserLocationDTO convertToUserLocationDTO (User user) {
		UserLocationDTO userLocationDTO = new UserLocationDTO();
		
		userLocationDTO.setUserID(user.getId());
		userLocationDTO.setFullName(user.getFirstName() + user.getLastName());
		City city = user.getCity();
		userLocationDTO.setCity(city.getName());
		userLocationDTO.setCountry(city.getCountry());
	
		return userLocationDTO;
		
	}
	
	
	public void addUser(User user) {

		
          userService.addUser(user);
	
	}


}
	


	


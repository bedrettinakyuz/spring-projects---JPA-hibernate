package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;

import com.javacourse.project.hibernateAndJpa.Dtos.UserDTO;
import com.javacourse.project.hibernateAndJpa.Dtos.UserLocationDTO;
import com.javacourse.project.hibernateAndJpa.Entities.User;


public interface IMapService {

	 List<UserLocationDTO> getAllUserLocation();
	 void addUser(User user);
}

package com.javacourse.project.hibernateAndJpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RestController;
import com.javacourse.project.hibernateAndJpa.Entities.*;
import com.javacourse.project.hibernateAndJpa.Business.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private IUserService userService;
    @Autowired
	public UserController(IUserService userService) {
		
		this.userService = userService;
	}
    
    @GetMapping("/users")
    public List<User> get(){
    	
    	return userService.getAll();
    }
    

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getById(@PathVariable Long id) {
    	

    	return new ResponseEntity<User>(userService.getByID(id),HttpStatus.OK);
    	
   }
  @DeleteMapping ("/delete/{id}")
  public void deleteById(@PathVariable Long id) {
	  
	 
	  userService.deleteUser(id);
  }
	
}


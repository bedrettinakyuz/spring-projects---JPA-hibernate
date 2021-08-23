package com.javacourse.project.hibernateAndJpa.Business;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javacourse.project.hibernateAndJpa.Entities.User;
import com.javacourse.project.hibernateAndJpa.Repositories.UserRepository;
@Service
public class UserManager implements IUserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public List<User> getAll() {
		
		
		return ((List<User>)this.userRepository.findAll());
	}
	@Transactional
	public Optional<User> getByID(Long id) {
		
		return userRepository.findById(id);
	}

	@Transactional
	public void addUser(User user) {
		
		 userRepository.save(user);
	}

	@Transactional
	public void deleteUser(Long id) {
	
		userRepository.deleteById(id);
	}
	
	
	
	
	
	
	


	
}

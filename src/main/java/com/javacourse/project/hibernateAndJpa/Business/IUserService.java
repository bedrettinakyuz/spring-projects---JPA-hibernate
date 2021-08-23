package com.javacourse.project.hibernateAndJpa.Business;
import com.javacourse.project.hibernateAndJpa.Entities.*;
import java.util.List;
import java.util.Optional;

import com.javacourse.project.hibernateAndJpa.Dtos.*;

public interface IUserService {

	List<User> getAll();
	void addUser(User user);
	Optional<User> getByID(Long id);
	void deleteUser(Long id);
}

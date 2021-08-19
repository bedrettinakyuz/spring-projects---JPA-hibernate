package com.javacourse.project.hibernateAndJpa.Dal;
import java.util.List;
import com.javacourse.project.hibernateAndJpa.Entities.User;

public interface IUserDal {
	
	List<User> getAll();
}

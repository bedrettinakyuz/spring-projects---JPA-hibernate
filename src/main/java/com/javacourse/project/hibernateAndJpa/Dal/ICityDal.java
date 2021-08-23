package com.javacourse.project.hibernateAndJpa.Dal;
import java.util.List;
import java.util.Optional;

import com.javacourse.project.hibernateAndJpa.Entities.*;
public interface ICityDal {
    
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	Optional<City> getById(Long id);
}

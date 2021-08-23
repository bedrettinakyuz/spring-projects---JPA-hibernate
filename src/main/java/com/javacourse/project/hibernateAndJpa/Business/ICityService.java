package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;
import java.util.Optional;

import com.javacourse.project.hibernateAndJpa.Entities.City;

public interface ICityService {

	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	Optional<City> getById(Long id);
}

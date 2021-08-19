package com.javacourse.project.hibernateAndJpa.Business;
import com.javacourse.project.hibernateAndJpa.Dal.*;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javacourse.project.hibernateAndJpa.Entities.City;

@Service
public class CityManager implements ICityService {
	private ICityDal cityDal;
	
	@Autowired
	public CityManager(ICityDal cityDal) {
		
		this.cityDal = cityDal;
	}
	

	@Override
	@Transactional
	public List<City> getAll() {
		// TODO Auto-generated method stub
		return this.cityDal.getAll();
	}

	@Override
	@Transactional
	public void add(City city) {
	this.cityDal.add(city);
		
	}

	@Override
	@Transactional
	public void update(City city) {
		this.cityDal.update(city);
		
	}

	@Override
	@Transactional
	public void delete(City city) {
		this.cityDal.delete(city);
		
	}

	@Override
	@Transactional
	public City getById(Long id) {
		
		return this.cityDal.getById(id);
	}


}

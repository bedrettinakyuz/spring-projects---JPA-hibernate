package com.javacourse.project.hibernateAndJpa.Dal;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;


import org.hibernate.Session;
import org.hibernate.engine.spi.SessionEventListenerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.Entities.City;
@Repository
public class HibernateCityDal implements ICityDal {
	private EntityManager entityManager;
	
	@Autowired
	public HibernateCityDal(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}
	//AOP - Aspect Oriented Programming
	@Override
	@Transactional
	public List<City> getAll() {
       Session session = entityManager.unwrap(Session.class);
       List<City> cities = session.createQuery("from City",City.class).getResultList();
       return cities;
	}

	@Transactional
	@Override
	public void add(City city) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.save(city);
		
	}

	@Transactional
	@Override
	public void update(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
		
	}
	@Transactional
	@Override
	public void delete(City city) {
		Session session = entityManager.unwrap(Session.class);
		City cityToDelete = session.get(City.class,city.getId());
		session.delete(cityToDelete);
	}
	@Transactional
	@Override
	public Optional<City> getById(Long id) {
		Session session = entityManager.unwrap(Session.class);
		
		City city = session.get(City.class, id);
		Optional<City> opt = Optional.ofNullable(city);
		return opt;
	}
 
}

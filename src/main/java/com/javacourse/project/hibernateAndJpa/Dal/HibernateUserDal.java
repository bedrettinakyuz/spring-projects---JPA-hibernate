package com.javacourse.project.hibernateAndJpa.Dal;

import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.javacourse.project.hibernateAndJpa.Entities.User;
@Repository
public class HibernateUserDal implements IUserDal {

	private EntityManager entityManager;
	
	public HibernateUserDal(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<User> getAll() {
	       Session session = entityManager.unwrap(Session.class);
	       List<User> users = session.createQuery("from User",User.class).getResultList();
	       return users;
	}

}

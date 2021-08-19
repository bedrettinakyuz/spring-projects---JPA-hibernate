package com.javacourse.project.hibernateAndJpa.Repositories;
import com.javacourse.project.hibernateAndJpa.Entities.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{}

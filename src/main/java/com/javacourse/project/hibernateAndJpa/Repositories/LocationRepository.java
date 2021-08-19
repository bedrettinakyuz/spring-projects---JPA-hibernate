package com.javacourse.project.hibernateAndJpa.Repositories;
import com.javacourse.project.hibernateAndJpa.Entities.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LocationRepository extends CrudRepository<City, Long> {}



package com.serhiihurin.springdatarestlecture.repositories;

import com.serhiihurin.springdatarestlecture.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {

}

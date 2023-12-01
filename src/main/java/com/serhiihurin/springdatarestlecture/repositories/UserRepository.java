package com.serhiihurin.springdatarestlecture.repositories;

import com.serhiihurin.springdatarestlecture.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "amogus", path = "amogus")
public interface UserRepository extends PagingAndSortingRepository<User, Long>, JpaRepository<User, Long> {

}

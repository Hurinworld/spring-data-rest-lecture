package com.serhiihurin.springdatarestlecture.repositories;

import com.serhiihurin.springdatarestlecture.entities.Department;
import com.serhiihurin.springdatarestlecture.projections.DepartmentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = DepartmentInfo.class)
public interface DepartmentRepository extends
        PagingAndSortingRepository<Department, Long>,
        JpaRepository<Department, Long> {
}

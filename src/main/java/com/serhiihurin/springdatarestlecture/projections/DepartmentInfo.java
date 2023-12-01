package com.serhiihurin.springdatarestlecture.projections;

import com.serhiihurin.springdatarestlecture.entities.Department;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "departmentInfo", types = {Department.class})
public interface DepartmentInfo {

    @Value("#{target.name} #{target.departmentEmail}")
    String getSimpleData();
}

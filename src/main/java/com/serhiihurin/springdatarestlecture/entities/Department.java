package com.serhiihurin.springdatarestlecture.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String departmentEmail;
    private String description;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "department")
    private List<User> users;
}

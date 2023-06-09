package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.Department;

public interface DepartmentRepository extends MongoRepository<Department, String> {

}

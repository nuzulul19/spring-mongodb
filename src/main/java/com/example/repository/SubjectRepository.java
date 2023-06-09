package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.Subject;

public interface SubjectRepository extends MongoRepository<Subject, String> {

}

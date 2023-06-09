package com.example.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.entity.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

    List<Student> findByName(String name);

    List<Student> findByNameAndMail(String name, String email);

    List<Student> findByNameOrMail(String name, String email);

    // will work with embedded documents
    List<Student> findByDepartmentDepartmentName(String departmentName);

    // will work with embedded documents
    List<Student> findBySubjectsSubjectName(String subjectName);

    List<Student> findByMailIsLike(String email);

    List<Student> findByNameStartsWith(String name);

    List<Student> findByDepartmentId(String deptId);

    @Query("{ \"name\": \"?0\" }")
    List<Student> getByName(String name);
}

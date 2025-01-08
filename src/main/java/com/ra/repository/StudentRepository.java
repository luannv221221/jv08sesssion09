package com.ra.repository;

import com.ra.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    Boolean create(Student student);
}

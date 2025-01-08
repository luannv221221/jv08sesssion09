package com.ra.service;

import com.ra.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Boolean create(Student student);
}

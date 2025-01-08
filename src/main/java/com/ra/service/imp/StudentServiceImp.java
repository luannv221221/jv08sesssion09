package com.ra.service.imp;

import com.ra.model.Student;
import com.ra.repository.StudentRepository;
import com.ra.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }
    @Override
    public Boolean create(Student student) {
        return studentRepository.create(student);
    }
}

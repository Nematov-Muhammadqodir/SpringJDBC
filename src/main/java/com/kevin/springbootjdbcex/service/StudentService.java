package com.kevin.springbootjdbcex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.springbootjdbcex.model.Student;
import com.kevin.springbootjdbcex.repo.StudentRepo;

@Service
public class StudentService {

    private StudentRepo studentRepo;

    public void create(Student s) {
        studentRepo.save(s);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

}

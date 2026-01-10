package com.kevin.springbootjdbcex.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kevin.springbootjdbcex.model.Student;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {

        String sql = "insert into student (rollNum, name , marks) values (?, ?, ?)";

        int rows = jdbc.update(sql, s.getRollNum(), s.getName(), s.getMarks());
        System.out.println("added" + rows);

    }

    public List<Student> findAll() {

        List<Student> students = new ArrayList<>();
        return students;
    }

}

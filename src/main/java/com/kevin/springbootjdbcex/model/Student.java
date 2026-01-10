package com.kevin.springbootjdbcex.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
    int rollNum;
    String name;
    int marks;

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [rollNum=" + rollNum + ", name=" + name + ", marks=" + marks + "]";
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

}

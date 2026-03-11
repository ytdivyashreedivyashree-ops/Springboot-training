package com.example.Project3.dto.request;

import java.util.List;

public class StudentRequest {
    private String name;
    private int rollno;
    private List<Integer> marks;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public List<Integer> getMarks() {
        return marks;
    }
    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    
}

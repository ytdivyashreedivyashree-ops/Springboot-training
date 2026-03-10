package com.example.Project1.dto.response;

public class StudentResponse {
    private String name;
    private int rollno;
    private int totalMarks;
    private double percentage;
    private String result;
    public StudentResponse(String name, int rollno, int totalMarks, double percentage, String result) {
        this.name = name;
        this.rollno = rollno;
        this.totalMarks = totalMarks;
        this.percentage = percentage;
        this.result = result;
    }
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
    public int getTotalMarks() {
        return totalMarks;
    }
    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }
    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }

    
    
}

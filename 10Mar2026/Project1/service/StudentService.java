package com.example.Project1.service;

import org.springframework.stereotype.Service;

import com.example.Project1.dto.request.StudentRequest;
import com.example.Project1.dto.response.StudentResponse;

@Service

public class StudentService {
    public StudentResponse calStudentResponse(StudentRequest req)
    {
        int total=0;
        total=req.getM1()+req.getM2()+req.getM3()+req.getM4()+req.getM5();
        double percentage=total/5.0;
        String result=percentage>=40?"Pass":"Fail";

        return new StudentResponse(req.getName(), req.getRollno(), total, percentage, result);
    }
    
}

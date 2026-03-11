package com.example.Project3.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project3.dto.request.StudentRequest;
import com.example.Project3.dto.response.ApiResponse;
import com.example.Project3.dto.response.StudentResponse;
import com.example.Project3.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/process")
    public ApiResponse getStudent(@RequestBody StudentRequest request)
    {
        StudentResponse response=studentService.processStudent(request);
        return new ApiResponse("Successfully processed", response);

    }
    
   
    
}

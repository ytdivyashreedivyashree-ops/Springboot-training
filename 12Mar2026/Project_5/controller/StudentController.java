package com.example.Project_5.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project_5.dto.request.RegisterRequest;
import com.example.Project_5.dto.request.Studentrequest;
// import com.example.Project_5.dto.response.ApiRegResponse;
import com.example.Project_5.dto.response.ApiResponse;
// import com.example.Project_5.dto.response.RegisterResponse;
import com.example.Project_5.dto.response.StudentResponse;
import com.example.Project_5.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    
    @PostMapping("/save")
    public ApiResponse <StudentResponse> saveStudent(@RequestBody Studentrequest studentrequest){
        StudentResponse studentResponse = studentService.saveStudent(studentrequest);
        return new ApiResponse<StudentResponse>("Student saved successfully", studentResponse);
    
    }

    @PostMapping("/{id}/assign")
    public ApiResponse<StudentResponse> assignRegister(
        @PathVariable long id,
        @RequestBody RegisterRequest request)
    {
            StudentResponse studentResponse = studentService.assignRegistration(id, request.getRegisterNumber());
            return new ApiResponse<StudentResponse>("Registration assigned successfully", studentResponse);
        }
    

    // @PostMapping("/assign")
    // public ApiResponse<RegisterResponse> assignRegistration(@RequestBody RegisterRequest request){
    //     RegisterResponse Response = studentService.assignRegistration(
    //        request.getStudentId(),request.getRegisterNumber());
    //     return new ApiResponse<RegisterResponse>("Registration assigned successfully", Response);
    // }

    // @GetMapping("/saved")
    // public ApiResponse<List<StudentResponse>> getDetails(){
    //     List<StudentResponse> studentResponses = studentService.getDetails();
    //     return new ApiResponse<List<StudentResponse>>("Student details retrieved successfully", studentResponses);
    // }
}

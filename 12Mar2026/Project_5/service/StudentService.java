package com.example.Project_5.service;

import org.springframework.stereotype.Service;

import com.example.Project_5.dto.request.Studentrequest;
import com.example.Project_5.dto.response.StudentResponse;
import com.example.Project_5.entity.Register;
import com.example.Project_5.entity.Student;
import com.example.Project_5.repository.RegisterRepo;
import com.example.Project_5.repository.StudentRepo;

@Service

public class StudentService {
    private final StudentRepo studentRepo;
    private final RegisterRepo registerRepo;
    

    
    public StudentService(StudentRepo studentRepo, RegisterRepo registerRepo) {
        this.studentRepo = studentRepo;
        this.registerRepo = registerRepo;
    }

    public StudentResponse saveStudent(Studentrequest studentrequest){
        Student student = new Student();
        student.setName(studentrequest.getName());
        Student save= studentRepo.save(student);

        return new StudentResponse(
            save.getId(), 
            save.getName(),
            null);
    }

    public StudentResponse assignRegistration(long studentId,String regNo){
        Student student = studentRepo.findById(studentId).orElseThrow(()-> new RuntimeException("Student not found" ));
        Register register = new Register();
        register.setRegisterNumber(regNo);
        Register savedRegister = registerRepo.save(register);
        
        student.setRegister(savedRegister);
        studentRepo.save(student);

        return new StudentResponse(
            student.getId(),
            student.getName(),
            savedRegister.getRegisterNumber()
        );
    }
    
}

package com.example.Project3.service;

import org.springframework.stereotype.Service;

import com.example.Project3.dto.request.StudentRequest;
import com.example.Project3.dto.response.StudentResponse;
import com.example.Project3.entity.Student;
import com.example.Project3.repository.StudentRepository;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    public StudentResponse processStudent(StudentRequest request)
    {
        int total=request.getMarks().stream().mapToInt(Integer::intValue).sum();
        double percentage=(double)total/request.getMarks().size();
        String results=percentage>=40?"Pass":"Fail";
        
        
        Student student=new Student();
        student.setName(request.getName());
        student.setRollno(request.getRollno());
        student.setPercentage(percentage);
        student.setResults(results);

        studentRepository.save(student);

        return new StudentResponse(request.getName(), request.getRollno(), total, percentage, results);
    }
}

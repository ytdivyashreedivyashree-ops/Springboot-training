package com.example.Project_5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project_5.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

    
} 
    


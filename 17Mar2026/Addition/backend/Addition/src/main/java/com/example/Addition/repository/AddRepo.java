package com.example.Addition.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Addition.entity.AddEntity;

public interface AddRepo extends JpaRepository<AddEntity, Long>{

    
} 
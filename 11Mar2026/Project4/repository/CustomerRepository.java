package com.example.Project4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project4.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}

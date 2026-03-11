package com.example.Project4.service;

import org.springframework.stereotype.Service;

import com.example.Project4.dto.request.CustomerRequest;
import com.example.Project4.dto.response.CustomerResponse;
import com.example.Project4.entity.Customer;
import com.example.Project4.repository.CustomerRepository;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerResponse processCustomer(CustomerRequest request) {

        double total = request.getProductprice()
                .stream()
                .mapToDouble(price -> price - 10)
                .sum();

        double gst = total * 18 / 100.0;
        double grandTotal = total + gst;

        Customer customer = new Customer();
        customer.setName(request.getName());
        customer.setTotal(total);
        customer.setGrandTotal(grandTotal);

        customer = customerRepository.save(customer);

        return new CustomerResponse(
                customer.getId(),
                customer.getName(),
                request.getProductname(),
                total,
                gst,
                grandTotal
        );
    }
}
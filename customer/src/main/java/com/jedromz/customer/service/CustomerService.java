package com.jedromz.customer.service;

import com.jedromz.customer.model.Customer;
import com.jedromz.customer.model.command.CustomerRegistrationRequest;
import com.jedromz.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository  customerRepository;
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.getFirstname())
                .lastName(request.getLastname())
                .email(request.getEmail())
                .build();
        customerRepository.save(customer);
    }
}


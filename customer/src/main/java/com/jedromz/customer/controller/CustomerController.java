package com.jedromz.customer.controller;

import com.jedromz.customer.model.command.CustomerRegistrationRequest;
import com.jedromz.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {
        log.info("NEW_CUSTOMER_REGISTERED {}", customerRegistrationRequest);
        customerService.registerCustomer(customerRegistrationRequest);
    }
}

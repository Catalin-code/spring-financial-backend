package com.codecool.springfinancial.customer;

import com.codecool.springfinancial.location.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    public Optional<Customer> getCustomerByPid(String pid) {
        return customerRepository.findCustomerByPid(pid);
    }

    public void addNewCustomer(Customer customer) {
        Optional<Customer> customerOptional = customerRepository.findCustomerByPid(customer.getPid());
        if (customerOptional.isPresent()) {
            throw new IllegalStateException("Customer with PID already exists !");
        }
        customerRepository.save(customer);
    }
}

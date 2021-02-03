package com.codecool.springfinancial.customer;

import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@RestController
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "api/customer/id={id}")
    public Optional<Customer> getCustomerById(@PathVariable("id") Long id, @RequestParam(required = false) String first_name, @RequestParam(required = false) String last_name, @RequestParam(required = false) LocalDate dob,
                                              @RequestParam(required = false) String address, @RequestParam(required = false) String email, @RequestParam(required = false)LocalDate idIssued,
                                              @RequestParam(required = false) LocalDate idExpiry, @RequestParam(required = false) String gender, @RequestParam(required = false) String pid) {
        return customerService.getCustomerById(id);
    }

    @GetMapping(path = "api/customer/pid={pid}")
    public Optional<Customer> getCustomerByPid(@PathVariable("pid") String pid, @RequestParam(required = false) String first_name, @RequestParam(required = false) String last_name, @RequestParam(required = false) LocalDate dob,
                                              @RequestParam(required = false) String address, @RequestParam(required = false) String email, @RequestParam(required = false)LocalDate idIssued,
                                              @RequestParam(required = false) LocalDate idExpiry, @RequestParam(required = false) String gender, @RequestParam(required = false) Long id) {
        return customerService.getCustomerByPid(pid);
    }

    @PostMapping(path = "api/customer/new-customer")
    public void addNewCustomer (@RequestBody Customer customer){
        customerService.addNewCustomer(customer);
    }

    @DeleteMapping(path = "api/customer/delete/id={id}")
    public void deleteCustomer(@PathVariable("id") Long id) {
        customerService.deleteCustomer(id);
    }
}

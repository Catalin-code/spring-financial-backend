package com.codecool.springfinancial.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

@RestController
public class EmployeeController {
    public final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @CrossOrigin
    @GetMapping(path = "api/employee/pid={pid}")
    public Optional<Employee> getEmployeeByPid(@PathVariable("pid") String pid){
        return employeeService.getEmployeeByPid(pid);
    }
}

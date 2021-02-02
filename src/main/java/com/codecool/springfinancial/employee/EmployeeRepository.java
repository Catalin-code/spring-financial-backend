package com.codecool.springfinancial.employee;

import com.codecool.springfinancial.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT s FROM Employee s WHERE s.pid = ?1")
    Optional<Employee> findEmployeeByPid(String pid);
}

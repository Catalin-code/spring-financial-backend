package com.codecool.springfinancial.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    List<Account> findByCustomerPid(String customerPid);

    Boolean existsByAccountNumber(String accountNumber);

}

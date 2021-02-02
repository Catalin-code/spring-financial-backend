package com.codecool.springfinancial.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

//    @Query("SELECT a from Account a WHERE a.customer_id = ?1")
    List<Account> findByCustomer(Long id);

}

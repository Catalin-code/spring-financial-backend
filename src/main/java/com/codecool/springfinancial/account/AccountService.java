package com.codecool.springfinancial.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void addNewAccount(Account account) {
        accountRepository.save(account);
    }

    public List<Account> getAccountsByCustomerId(Long customerId){
        return accountRepository.findByCustomerId(customerId);
    }
}

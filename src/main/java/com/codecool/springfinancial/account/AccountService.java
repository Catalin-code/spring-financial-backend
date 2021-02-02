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

    public void deleteAccount(Long customerId){
        accountRepository.deleteById(customerId);
    }

    public List<Account> getAccountsByCustomerId(Long customerId){
        return accountRepository.findByCustomerId(customerId);
    }

    public void updateAccountAmount(Long Id, double amount){
        Account account = accountRepository.findById(Id).orElseThrow(() ->
                new IllegalStateException("Account with id " + Id + "does not exist!"));
        if (account.getAmount() + amount < 0) {
            throw new IllegalStateException("Not enough funds");
        }
    }


}

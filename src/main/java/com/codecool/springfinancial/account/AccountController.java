package com.codecool.springfinancial.account;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("api/account/customerId={customerId}")
    public List<Account> getAccountsByCustomerId(@PathVariable("customerId") Long customerId) {
        return accountService.getAccountsByCustomerId(customerId);
    }

    @PostMapping("api/account/new-account")
    public void addNewAccount(@RequestBody Account account){
        accountService.addNewAccount(account);
    }

    @DeleteMapping("api/account/delete/id={id}")
    public void deleteAccount(@PathVariable("id") Long id){
        accountService.deleteAccount(id);
    }

}

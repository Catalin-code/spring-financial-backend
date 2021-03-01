package com.codecool.springfinancial.account;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("api/account/customerId={customerId}")
    public List<Account> getAccountsByCustomerId(@PathVariable("customerId")Long customerId) {
        return accountService.getAccountsByCustomerId(customerId);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping("api/account/new-account")
    public void addNewAccount(@RequestBody Account account){
        accountService.addNewAccount(account);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @DeleteMapping("api/account/delete/id={id}")
    public void deleteAccount(@PathVariable("id") Long id){
        accountService.deleteAccount(id);
    }

}

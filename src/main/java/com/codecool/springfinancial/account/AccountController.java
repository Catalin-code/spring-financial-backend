package com.codecool.springfinancial.account;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/test")
@RestController
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/account/customerId={customerId}")
    public List<Account> getAccountsByCustomerId(@PathVariable("customerId")Long customerId) {
        return accountService.getAccountsByCustomerId(customerId);
    }

    @PostMapping("/account/new-account")
    public void addNewAccount(@RequestBody Account account){
        accountService.addNewAccount(account);
    }

    @DeleteMapping("/account/delete/id={id}")
    public void deleteAccount(@PathVariable("id") Long id){
        accountService.deleteAccount(id);
    }

}

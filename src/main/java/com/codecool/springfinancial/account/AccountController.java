package com.codecool.springfinancial.account;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("{customerId}")
    public List<Account> getAccountsByCustomerId(@PathVariable("customerId") Long customerId) {
        return accountService.getAccountsByCustomerId(customerId);
    }
}

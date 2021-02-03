package com.codecool.springfinancial.account;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AccountConfig {

    @Bean
    CommandLineRunner accountRunner(AccountRepository accountRepository){
        return args -> {
            Account one = new Account(
                    1l,
                    "Debit",
                    "RON",
                    7000,
                    "RO26PORL2939429482277393",
                    0.5
            );

            Account two = new Account(
                    1l,
                    "Credit",
                    "EUR",
                    25000,
                    "RO62PORL4752952435627713",
                    0.0
            );
            accountRepository.saveAll(List.of(one, two));
        };
    }
}

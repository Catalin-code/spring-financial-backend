package com.codecool.springfinancial.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OnlineAccountConfig {
    @Bean
    CommandLineRunner userRunner(OnlineAccountRepository repository){
        return args -> {
            OnlineAccount admin = new OnlineAccount(
                    "admin",
                    "admin",
                    OnlineAccountRole.ADMIN

            );
            repository.saveAll(List.of(admin));
        };
    }
}

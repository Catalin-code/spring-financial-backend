package com.codecool.springfinancial.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner userRunner(UserRepository repository){
        return args -> {
            User admin = new User(
                    "admin",
                    "admin"
            );
            repository.saveAll(List.of(admin));
        };
    }
}

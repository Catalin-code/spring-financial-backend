package com.codecool.springfinancial.user;

import com.codecool.springfinancial.location.Location;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository){
        return args -> {
            User admin = new User(
                    "admin",
                    "admin"
            );
        };
    }
}

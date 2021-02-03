package com.codecool.springfinancial.card;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class CardConfig {

    @Bean
    CommandLineRunner cardRunner(CardRepository repository){
        return args -> {
            Card one = new Card(
                    1l,
                    1l,
                    "4916375533388881",
                    "Debit",
                    LocalDate.of(2024, Month.OCTOBER, 10),
                    842,
                    "Ciprian",
                    "Draganica",
                    true
            );

            Card two = new Card(
                    2l,
                    1l,
                    "4024007117894187",
                    "Credit",
                    LocalDate.of(2022, Month.DECEMBER, 22),
                    566,
                    "Ciprian",
                    "Draganica",
                    true
            );
        };
    }
}

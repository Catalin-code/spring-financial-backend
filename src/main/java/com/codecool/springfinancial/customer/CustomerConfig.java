package com.codecool.springfinancial.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class CustomerConfig {
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository) {
        return args -> {
            Customer ciprian = new Customer(
                    "Draganica",
                    "Ciprian",
                    LocalDate.of(1993, Month.DECEMBER, 10),
                    "Strada Strazilor 4, Bloc 2, Apartament 33, Bucuresti",
                    "draganicaciprian@gmail.com",
                    LocalDate.of(2019, Month.APRIL, 12),
                    LocalDate.of(2029, Month.APRIL, 12),
                    "M",
                    "1931210405638"
            );

            Customer andrei = new Customer(
                    "Stancu",
                    "Andrei",
                    LocalDate.of(1998, Month.JANUARY, 2),
                    "Aleea Livezilor 11, Bloc 1, Apartament 17, Ploiesti",
                    "andreistancu@livezilor.com",
                    LocalDate.of(2018, Month.DECEMBER, 5),
                    LocalDate.of(2028, Month.DECEMBER, 5),
                    "M",
                    "1980202409803"
            );

            Customer catalin = new Customer(
                    "Despanu",
                    "Catalin",
                    LocalDate.of(1999, Month.JULY, 6),
                    "Bulevardul Ion Creanga 1, Ploiesti",
                    "catalin.despa@rich.com",
                    LocalDate.of(2014, Month.MARCH, 15),
                    LocalDate.of(2024, Month.MARCH, 15),
                    "M",
                    "1990706408844"
            );

            Customer gheorghe = new Customer(
                    "Ionescu",
                    "Gheorghe",
                    LocalDate.of(2005, Month.JULY, 3),
                    "Calea Crângași 87, București",
                    "ionescu23@gmail.com",
                    LocalDate.of(2015, Month.MARCH, 15),
                    LocalDate.of(2025, Month.MARCH, 15),
                    "M",
                    "5050603409873"
            );

            Customer maria = new Customer(
                    "Marinescu",
                    "Maria",
                    LocalDate.of(2003, Month.FEBRUARY, 2),
                    "Bulevardul Decebal 9, București",
                    "maria03@hotmail.com",
                    LocalDate.of(2017, Month.MARCH, 15),
                    LocalDate.of(2017, Month.MARCH, 15),
                    "M",
                    "6040202409271"
            );

            repository.saveAll(
                    List.of(ciprian, andrei, catalin, gheorghe, maria)
            );
        };
    }
}

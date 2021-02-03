package com.codecool.springfinancial.card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    private final CardRepository repository;

    @Autowired
    public CardService(CardRepository repository) {
        this.repository = repository;
    }
}

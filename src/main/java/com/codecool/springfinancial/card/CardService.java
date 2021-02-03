package com.codecool.springfinancial.card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    private final CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public void addNewCard(Card card){
        cardRepository.save(card);
    }

    public void deleteCard(Long id) { cardRepository.deleteById(id);}
}

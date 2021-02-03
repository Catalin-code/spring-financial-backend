package com.codecool.springfinancial.card;

import org.springframework.web.bind.annotation.*;

@RestController
public class CardController {

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping("api/card/new-card")
    public void addNewCard(@RequestBody Card card){
        cardService.addNewCard(card);
    }

    @DeleteMapping("api/card/delete/{id}")
    public void deleteCard(@PathVariable("id")Long id){
        cardService.deleteCard(id);
    }
}

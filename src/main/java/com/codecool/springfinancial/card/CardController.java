package com.codecool.springfinancial.card;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CardController {

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("api/card/accountId={accountId}")
    public List<Card> getCardsByAccountId(@PathVariable("accountId")Long accountId){
        return cardService.getCardsByAccountId(accountId);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("api/card/new-card")
    public void addNewCard(@RequestBody Card card){
        cardService.addNewCard(card);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("api/card/delete/id={id}")
    public void deleteCard(@PathVariable("id")Long id){
        cardService.deleteCard(id);
    }
}

package com.codecool.springfinancial.card;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class CardController {

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/card/accountId={accountId}")
    public List<Card> getCardsByAccountId(@PathVariable("accountId")Long accountId){
        return cardService.getCardsByAccountId(accountId);
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @PostMapping("/card/new-card")
    public void addNewCard(@RequestBody Card card){
        cardService.addNewCard(card);
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @DeleteMapping("/card/delete/id={id}")
    public void deleteCard(@PathVariable("id")Long id){
        cardService.deleteCard(id);
    }
}

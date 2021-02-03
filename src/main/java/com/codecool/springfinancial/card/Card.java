package com.codecool.springfinancial.card;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Card {

    @Id
    @SequenceGenerator(
            name = "card_sequence",
            sequenceName = "card_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "card_sequence"
    )

    private Long id;
    private Long accountId;
    private Long customerId;
    private int cardNumber;
    private String type;
    private LocalDate expirationDate;
    private int CVV;
    private String customerFirstName;
    private String customerLastName;
    private boolean contactless;

    public Card() {
    }

    public Card(Long id, Long accountId, Long customerId, int cardNumber, String type, LocalDate expirationDate, int CVV, String customerFirstName, String customerLastName, boolean contactless) {
        this.id = id;
        this.accountId = accountId;
        this.customerId = customerId;
        this.cardNumber = cardNumber;
        this.type = type;
        this.expirationDate = expirationDate;
        this.CVV = CVV;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.contactless = contactless;
    }

    public Card(Long accountId, Long customerId, int cardNumber, String type, LocalDate expirationDate, int CVV, String customerFirstName, String customerLastName, boolean contactless) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.cardNumber = cardNumber;
        this.type = type;
        this.expirationDate = expirationDate;
        this.CVV = CVV;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.contactless = contactless;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public boolean isContactless() {
        return contactless;
    }

    public void setContactless(boolean contactless) {
        this.contactless = contactless;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", accountId=" + accountId +
                ", customerId=" + customerId +
                ", cardNumber=" + cardNumber +
                ", type='" + type + '\'' +
                ", expirationDate=" + expirationDate +
                ", CVV=" + CVV +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", contactless=" + contactless +
                '}';
    }
}

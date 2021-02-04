package com.codecool.springfinancial.card;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

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
    private String cardNumber;
    private String accountType;
    private LocalDate expirationDate;
    private int CVV;
    private String customerFirstName;
    private String customerLastName;
    private boolean contactless;

    public Card() {
    }

    public Card(Long id, Long accountId, Long customerId, String cardNumber, String accountType, LocalDate expirationDate, int CVV, String customerFirstName, String customerLastName, boolean contactless) {
        this.id = id;
        this.accountId = accountId;
        this.customerId = customerId;
        this.cardNumber = cardNumber;
        this.accountType = accountType;
        this.expirationDate = expirationDate;
        this.CVV = CVV;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.contactless = contactless;
    }

    public Card(Long accountId, Long customerId, String cardNumber, String accountType, LocalDate expirationDate, int CVV, String customerFirstName, String customerLastName, boolean contactless) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.cardNumber = cardNumber;
        this.accountType = accountType;
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

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String type) {
        this.accountType = type;
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
                ", type='" + accountType + '\'' +
                ", expirationDate=" + expirationDate +
                ", CVV=" + CVV +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", contactless=" + contactless +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return CVV == card.CVV && contactless == card.contactless && id.equals(card.id) && accountId.equals(card.accountId) && customerId.equals(card.customerId) && cardNumber.equals(card.cardNumber) && accountType.equals(card.accountType) && expirationDate.equals(card.expirationDate) && customerFirstName.equals(card.customerFirstName) && customerLastName.equals(card.customerLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountId, customerId, cardNumber, accountType, expirationDate, CVV, customerFirstName, customerLastName, contactless);
    }
}

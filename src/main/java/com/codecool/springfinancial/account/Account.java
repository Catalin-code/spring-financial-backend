package com.codecool.springfinancial.account;

import javax.persistence.*;

@Entity
@Table
public class Account {

    @Id
    @SequenceGenerator(
            name = "account_sequence",
            sequenceName = "account_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "account_sequence"
    )

    private Long id;
    private Long customer_id;
    private String type;
    private String currency;
    private float amount;
    private String account_number;
    private float interest;

    public Account() {
    }

    public Account(Long id, Long customer_id, String type, String currency, float amount, String account_number, float interest) {
        this.id = id;
        this.customer_id = customer_id;
        this.type = type;
        this.currency = currency;
        this.amount = amount;
        this.account_number = account_number;
        this.interest = interest;
    }

    public Account(Long customer_id, String type, String currency, float amount, String account_number, float interest) {
        this.customer_id = customer_id;
        this.type = type;
        this.currency = currency;
        this.amount = amount;
        this.account_number = account_number;
        this.interest = interest;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", customer_id=" + customer_id +
                ", type='" + type + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                ", account_number='" + account_number + '\'' +
                ", interest=" + interest +
                '}';
    }
}

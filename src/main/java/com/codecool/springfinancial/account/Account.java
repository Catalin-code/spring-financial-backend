package com.codecool.springfinancial.account;

import javax.persistence.*;
import java.util.Objects;

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
    private Long customerId;
    private String type;
    private String currency;
    private double amount;
    private String account_number;
    private double interest;

    public Account() {
    }

    public Account(Long id, Long customerId, String type, String currency, double amount, String account_number, double interest) {
        this.id = id;
        this.customerId = customerId;
        this.type = type;
        this.currency = currency;
        this.amount = amount;
        this.account_number = account_number;
        this.interest = interest;
    }

    public Account(Long customerId, String type, String currency, double amount, String account_number, double interest) {
        this.customerId = customerId;
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

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customer_id) {
        this.customerId = customer_id;
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

    public double getAmount() {
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

    public double getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", customer_id=" + customerId +
                ", type='" + type + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                ", account_number='" + account_number + '\'' +
                ", interest=" + interest +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return Double.compare(account.amount, amount) == 0 && Double.compare(account.interest, interest) == 0 && id.equals(account.id) && customerId.equals(account.customerId) && type.equals(account.type) && currency.equals(account.currency) && account_number.equals(account.account_number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerId, type, currency, amount, account_number, interest);
    }
}

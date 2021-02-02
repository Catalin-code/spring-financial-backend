package com.codecool.springfinancial.customer;

import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Customer {
    @Id
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence"
    )

    private Long id;
    private String first_name;
    private String last_name;
    private LocalDate dob;
    @Transient
    private Integer age;
    private String address;
    private String email;
    private LocalDate idIssued;
    private LocalDate idExpiry;
    private String gender;
    private String pid;

    public Customer() {
    }

    public Customer(Long id, String first_name, String last_name, LocalDate dob, String address, String email, LocalDate idIssued, LocalDate idExpiry, String gender, String pid) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.dob = dob;
        this.address = address;
        this.email = email;
        this.idIssued = idIssued;
        this.idExpiry = idExpiry;
        this.gender = gender;
        this.pid = pid;
    }

    public Customer(String first_name, String last_name, LocalDate dob, String address, String email, LocalDate idIssued, LocalDate idExpiry, String gender, String pid) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.dob = dob;
        this.address = address;
        this.email = email;
        this.idIssued = idIssued;
        this.idExpiry = idExpiry;
        this.gender = gender;
        this.pid = pid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getId_issued() {
        return idIssued;
    }

    public void setId_issued(LocalDate idIssued) {
        this.idIssued = idIssued;
    }

    public LocalDate getId_expiry() {
        return idExpiry;
    }

    public void setId_expiry(LocalDate idExpiry) {
        this.idExpiry = idExpiry;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Integer getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", idIssued=" + idIssued +
                ", idExpiry=" + idExpiry +
                ", gender='" + gender + '\'' +
                ", pid='" + pid + '\'' +
                '}';
    }
}

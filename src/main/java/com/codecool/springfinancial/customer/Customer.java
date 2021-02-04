package com.codecool.springfinancial.customer;

import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

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
    private String firstName;
    private String lastName;
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

    public Customer(Long id, String firstName, String lastName, LocalDate dob, String address, String email, LocalDate idIssued, LocalDate idExpiry, String gender, String pid) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.address = address;
        this.email = email;
        this.idIssued = idIssued;
        this.idExpiry = idExpiry;
        this.gender = gender;
        this.pid = pid;
    }

    public Customer(String firstName, String lastName, LocalDate dob, String address, String email, LocalDate idIssued, LocalDate idExpiry, String gender, String pid) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return id.equals(customer.id) && firstName.equals(customer.firstName) && lastName.equals(customer.lastName) && dob.equals(customer.dob) && age.equals(customer.age) && address.equals(customer.address) && email.equals(customer.email) && idIssued.equals(customer.idIssued) && idExpiry.equals(customer.idExpiry) && gender.equals(customer.gender) && pid.equals(customer.pid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, dob, age, address, email, idIssued, idExpiry, gender, pid);
    }
}

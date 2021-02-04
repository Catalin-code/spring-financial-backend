package com.codecool.springfinancial.user;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table
public class OnlineAccount {

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )

    private Long id;
    private String pid;
    private String password;

    public OnlineAccountRole getOnlineAccountRole() {
        return onlineAccountRole;
    }

    public void setOnlineAccountRole(OnlineAccountRole onlineAccountRole) {
        this.onlineAccountRole = onlineAccountRole;
    }

    private OnlineAccountRole onlineAccountRole = OnlineAccountRole.USER;

    public OnlineAccount() {
    }

    public OnlineAccount(Long id, String pid, String password, OnlineAccountRole onlineAccountRole) {
        this.id = id;
        this.pid = pid;
        this.password = password;
        this.onlineAccountRole = onlineAccountRole;
    }

    public OnlineAccount(String pid, String password, OnlineAccountRole onlineAccountRole) {
        this.pid = pid;
        this.password = password;
        this.onlineAccountRole = onlineAccountRole;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "OnlineAccount{" +
                "id=" + id +
                ", pid='" + pid + '\'' +
                ", password='" + password + '\'' +
                ", onlineAccountRole=" + onlineAccountRole +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OnlineAccount)) return false;
        OnlineAccount that = (OnlineAccount) o;
        return id.equals(that.id) && pid.equals(that.pid) && password.equals(that.password) && onlineAccountRole == that.onlineAccountRole;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pid, password, onlineAccountRole);
    }
}

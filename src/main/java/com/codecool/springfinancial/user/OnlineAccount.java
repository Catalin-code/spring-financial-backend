package com.codecool.springfinancial.user;

import javax.persistence.*;

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

}

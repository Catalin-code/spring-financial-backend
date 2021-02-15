package com.codecool.springfinancial.onlineaccount;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
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

    private OnlineAccountRole onlineAccountRole = OnlineAccountRole.USER;

    public OnlineAccount(String pid, String password, OnlineAccountRole onlineAccountRole) {
        this.pid = pid;
        this.password = password;
        this.onlineAccountRole = onlineAccountRole;
    }
}

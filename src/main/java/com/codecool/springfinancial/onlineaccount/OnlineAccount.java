package com.codecool.springfinancial.onlineaccount;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
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

    public OnlineAccount(String pid, String password, OnlineAccountRole onlineAccountRole) {
        this.pid = pid;
        this.password = password;
        this.onlineAccountRole = onlineAccountRole;
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

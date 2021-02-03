package com.codecool.springfinancial.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OnlineAccountRepository extends JpaRepository<OnlineAccount, Long> {

    Optional<OnlineAccount> findOnlineAccountByPid(String pid);
}

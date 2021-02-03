package com.codecool.springfinancial.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OnlineAccountService {
    private final OnlineAccountRepository onlineAccountRepository;

    @Autowired
    public OnlineAccountService(OnlineAccountRepository onlineAccountRepository) {
        this.onlineAccountRepository = onlineAccountRepository;
    }


    public void addNewUser(OnlineAccount onlineAccount) {
        Optional<OnlineAccount> onlineAccountByPid = onlineAccountRepository.findOnlineAccountByPid(onlineAccount.getPid());
        if (onlineAccountByPid.isPresent()){
            throw new IllegalStateException("PID taken");
        }
        onlineAccountRepository.save(onlineAccount);
    }

    public List<OnlineAccount> getAllUsers(){
        return onlineAccountRepository.findAll();
    }
}

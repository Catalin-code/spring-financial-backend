package com.codecool.springfinancial.onlineaccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class OnlineAccountService {
    private final OnlineAccountRepository onlineAccountRepository;

    @Autowired
    public OnlineAccountService(OnlineAccountRepository onlineAccountRepository) {
        this.onlineAccountRepository = onlineAccountRepository;
    }


    public void addNewOnlineAccount(OnlineAccount onlineAccount) {
        Optional<OnlineAccount> onlineAccountByPid = onlineAccountRepository.findOnlineAccountByPid(onlineAccount.getPid());
        if (onlineAccountByPid.isPresent()){
            throw new IllegalStateException("PID taken");
        }
        onlineAccountRepository.save(onlineAccount);
    }

    @Transactional
    public void deleteOnlineAccount(String pid){

        onlineAccountRepository.deleteByPid(pid);
    }

    @Transactional
    public void updateUser(String pid, String password){
        OnlineAccount onlineAccount = onlineAccountRepository.findOnlineAccountByPid(pid).orElseThrow(() ->
                new IllegalStateException("Account with pid " + pid + " does not exist !"));
        if (password != null && password.length() > 0){
            onlineAccount.setPassword(password);
        }

    }


    public List<OnlineAccount> getAllUsers(){
        return onlineAccountRepository.findAll();
    }
}

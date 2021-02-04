package com.codecool.springfinancial.onlineaccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/online-account")
public class OnlineAccountController {
    private final OnlineAccountService onlineAccountService;
    @Autowired
    public OnlineAccountController(OnlineAccountService onlineAccountService){
        this.onlineAccountService = onlineAccountService;
    }

    @PostMapping("new-online-account")
    public void registerNewOnlineAccount(@RequestBody OnlineAccount onlineAccount){
        onlineAccountService.addNewOnlineAccount(onlineAccount);
    }
    @DeleteMapping("delete/pid={pid}")
    public void deleteOnlineAccount(@PathVariable("pid") String pid){
        onlineAccountService.deleteOnlineAccount(pid);
    }

    @GetMapping
    public List<OnlineAccount> getAllOnlineAccount(){
        return onlineAccountService.getAllOnlineAccounts();
    }

    @PutMapping(path = "change-password/pid={pid}")
    public void changePassword(
            @PathVariable("pid") String pid,
            @RequestParam(required = false) String password) {
        onlineAccountService.changePassword(pid, password);
    }
}

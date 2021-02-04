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
    public void deleteUser(@PathVariable("pid") String pid){
        onlineAccountService.deleteOnlineAccount(pid);
    }

    @GetMapping
    public List<OnlineAccount> getAll(){
        return onlineAccountService.getAllUsers();
    }

    @PutMapping(path = "update/pid={pid}")
    public void updateCustomer(
            @PathVariable("pid") String pid,
            @RequestParam(required = false) String password) {
        onlineAccountService.updateUser(pid, password);
    }
}

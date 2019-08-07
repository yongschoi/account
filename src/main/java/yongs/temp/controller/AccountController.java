package yongs.temp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import yongs.temp.service.AccountService;
import yongs.temp.vo.Account;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);	

    @Autowired
    AccountService service;
    
    @GetMapping("/{user}")
    public Account getAccount(@PathVariable("user") String username) throws Exception{
    	logger.debug("yongs-account|AccountController|getAccount()");
        return service.getAccount(username);
    }
}
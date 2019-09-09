package yongs.temp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yongs.temp.db.mapper.AccountMapper;
import yongs.temp.vo.Account;

@Service
public class AccountService {
    private static final Logger logger = LoggerFactory.getLogger(AccountService.class);	

    @Autowired
    AccountMapper mapper;
    
    public Account getAccount(String username) throws Exception {
    	logger.debug("yongs-account|AccountService|getAccount()");   	
        return mapper.getAccount(username);
    }
}
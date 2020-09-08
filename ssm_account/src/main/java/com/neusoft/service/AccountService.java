package com.neusoft.service;

import com.neusoft.domain.Account;

import java.util.List;

public interface AccountService {

    public List<Account> findAll();

    public void  saveAccount(Account account);
}

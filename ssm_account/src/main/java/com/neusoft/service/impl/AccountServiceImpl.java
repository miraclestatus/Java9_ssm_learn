package com.neusoft.service.impl;

import com.neusoft.dao.IAccountDao;
import com.neusoft.domain.Account;
import com.neusoft.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Eric Lee
 * @date 2020/9/8 11:43
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有账户");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层添加账户");

        accountDao.saveAccount(account);
    }
}

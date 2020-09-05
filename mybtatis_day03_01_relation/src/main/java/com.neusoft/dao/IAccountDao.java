package com.neusoft.dao;

import com.neusoft.domain.Account;
import com.neusoft.domain.AccountUser;

import java.util.List;

public interface IAccountDao {

    //  查询所有账户，同时还要获取到当前账户的所属用户信息
   List<Account> findAll();

   // 查询所有账户， 并且带有用户名和用户地址信息
   List<AccountUser> findAllAccount();
}

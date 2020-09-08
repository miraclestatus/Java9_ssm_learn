package com.neusoft.dao;

import com.neusoft.domain.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAccountDao {

    // 查询所有账户信息
    @Select("select * from account")
    public List<Account> findAll();

}

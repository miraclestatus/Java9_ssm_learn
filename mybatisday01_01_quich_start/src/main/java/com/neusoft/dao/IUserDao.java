package com.neusoft.dao;

import com.neusoft.domain.User;

import java.util.List;

public interface IUserDao {
    // 查询所有
    List<User> findAll();
}

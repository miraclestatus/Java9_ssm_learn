package com.neusoft.dao;

import com.neusoft.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUserDao {
    // 查询所有
    List<User> findAll();
    /**
     * 根据id查询
     */
   User findById(Integer id);
}

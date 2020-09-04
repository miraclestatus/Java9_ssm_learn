package com.neusoft.dao;

import com.neusoft.domain.Emp;

import java.util.List;

public interface IEmpDao {
    // 查询所有
    List<Emp> findAll();
    /**
     * 根据id查询
     */
    Emp findById(Integer id);
    /*
       保存用户 返回插入后的自增长的id值 在user里面 不是这个返回值
    */
    int saveEmp(Emp emp);
    /*
        更新用户
    */
    int updateEmp(Emp emp);
    /*
        删除用户
    */
    int deleteEmp(Integer id);

}

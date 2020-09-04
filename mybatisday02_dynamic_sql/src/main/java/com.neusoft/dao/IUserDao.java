package com.neusoft.dao;

import com.neusoft.domain.QueryVo;
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
    /**
     * 保存用户  返回插入后自增长的id 在 user里面 不是这个返回值
     */
    int savaUser(User user);
    /**
     * 更新用户
     */
    int  updateUser(User user);
    /**
     * 删除用户
     */
    int deleteUser(Integer id);
    /**
     * 根据姓名进行模糊查询
     */

    List<User> findByName(String  username);
    /**
     * 查询总记录数
     */
    int findTotal();
    // 根据传参条件  进行查询 有可能是用户名， 有可能是性别。啥都可能
   List<User> findByCondition(User user);

   // 传入 其他实体类类型
   List<User> findUserByQueryVo(QueryVo vo);


   // 根据id集合进行用户查询
   List<User> findUserByIds(QueryVo vo);



}

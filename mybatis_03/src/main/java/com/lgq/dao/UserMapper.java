package com.lgq.dao;

import com.lgq.pojo.User;

import java.util.List;

/**
 * @author lgq
 * @create 2020-12-21-14:35
 */
public interface UserMapper {
    //查询全部用户
    List<User> getUserList();

    //根据ID查询用户
    User getUserById(int id);


}

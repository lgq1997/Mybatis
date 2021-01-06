package com.lgq.dao;

import com.lgq.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author lgq
 * @create 2020-12-21-14:35
 */
public interface UserMapper {
    //查询全部用户
    List<User> getUserList();

    //根据ID查询用户
    User getUserById(int id);

    //分页
    List<User> getUserByLimit(Map<String,Object> map);



}

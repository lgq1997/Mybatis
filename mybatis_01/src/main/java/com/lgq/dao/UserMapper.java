package com.lgq.dao;

import com.lgq.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author lgq
 * @create 2020-12-20-14:44
 */
public interface UserMapper {
    //查询全部用户
    List<User> getUserList();

    //根据ID查询用户
    User getUserById(int id);

    //模糊查询
    List<User> getUserLike(String name);

    //insert一个用户
    int addUser(User user);
    //万能的Map
    int addUser2(Map<String,Object> map);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);




}

package com.lgq.dao;

import com.lgq.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lgq
 * @create 2021-01-05-13:40
 */
public interface UserMapper {

    //根据id查询用户
    User queryUserById(@Param("id") int id);

}

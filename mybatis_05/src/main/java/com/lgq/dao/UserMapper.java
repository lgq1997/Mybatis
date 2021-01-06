package com.lgq.dao;

import com.lgq.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lgq
 * @create 2020-12-23-13:47
 */
public interface UserMapper {
    @Select("select * from user")
    List<User> getUsers();

    //方法存在多个参数，所有参数前必须加上@Param注解
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);

}

package com.lgq.dao;

import com.lgq.pojo.User;
import com.lgq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author lgq
 * @create 2020-12-21-14:36
 */
public class UserMapperTest {

    @Test
    public void getUserList() {
        //1.获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2.执行SqlSession
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        System.out.println(userList);

        //关闭SqlSession
        sqlSession.close();
    }

    //增删改查需要提交事务sqlSession.commit();
    @Test
    public void addUser() {
        //1.获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2.执行SqlSession
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.addUser(new User(9,"1b","abc"));
        System.out.println(res);

        //提交事务
        sqlSession.commit();
        sqlSession.close();

    }
}


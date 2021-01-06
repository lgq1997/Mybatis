package com.lgq.dao;

import com.lgq.pojo.User;
import com.lgq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lgq
 * @create 2021-01-05-13:47
 */
public class UserMapperTest {

    @Test
    public void queryUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user1 = mapper.queryUserById(3);
        System.out.println(user1);

        System.out.println("===============================");
        User user2 = mapper.queryUserById(3);
        System.out.println(user2);

        System.out.println(user1==user2);

        sqlSession.close();
    }

    @Test
    public void tesy(){
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);

        User user1 = mapper1.queryUserById(3);
        System.out.println(user1);

        sqlSession1.close();

        System.out.println("===============================");
        User user2 = mapper2.queryUserById(3);
        System.out.println(user2);

        System.out.println(user1 == user2);
        sqlSession2.close();
    }
}
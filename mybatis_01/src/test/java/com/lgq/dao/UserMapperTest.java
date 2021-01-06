package com.lgq.dao;

import com.lgq.pojo.User;
import com.lgq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @author lgq
 * @create 2020-12-20-14:58
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

    @Test
    public void getUserById() {
        //1.获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2.执行SqlSession
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);

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

    @Test
    public void updateUser() {
        //1.获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2.执行SqlSession
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.updateUser(new User(4,"ll","abc"));
        System.out.println(res);

        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        //1.获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2.执行SqlSession
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.deleteUser(4);
        System.out.println(res);

        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void testAddUser2() {
        //1.获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2.执行SqlSession
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("userId",5);
        map.put("userName","kkk");
        map.put("password","123");
        int res = mapper.addUser2(map);
        System.out.println(res);

        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void getUserLike() {
        //1.获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2.执行SqlSession
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> res = mapper.getUserLike("哈");
        System.out.println(res);

    }

    @Test
    public void test() {


    }
}



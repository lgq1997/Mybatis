package com.lgq.dao;

import com.lgq.pojo.User;
import com.lgq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lgq
 * @create 2020-12-22-14:15
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

    //注意导包：org.apache.log4j.Logger
    //生成日志对象，参数为当前类的class
    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void getUserById() {
        logger.info("info：进入getUserById方法");
        //1.获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2.执行SqlSession
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);

        //关闭SqlSession
        sqlSession.close();
    }


    @Test
    public void getUserByLimit() {
        //1.获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //2.执行SqlSession
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("startIndex",2);
        map.put("pageSize",3);
        List<User> list = mapper.getUserByLimit(map);
        System.out.println(list);

        //关闭SqlSession
        sqlSession.close();

    }
}
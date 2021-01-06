package com.lgq.dao;

import com.lgq.pojo.Blog;
import com.lgq.utils.IDUtils;
import com.lgq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.util.*;

import static org.junit.Assert.*;

/**
 * @author lgq
 * @create 2021-01-04-20:29
 */
public class BlogMapperTest {

    @Test
    public void addBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("五块钱如何花三天");
        blog.setAuthor("lgq");
        blog.setCreateTime(new Date());
        blog.setViews(500);

        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("六块钱如何花三天");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("七块钱如何花三天");
        mapper.addBlog(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("八块钱如何花三天");
        mapper.addBlog(blog);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void queryBlogIf() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<String,String> map = new HashMap<>();
        map.put("title","五块钱如何花三天");
        map.put("author","lgq");

        List<Blog> list = mapper.queryBlogIf(map);
        System.out.println(list);

        sqlSession.close();
    }

    @Test
    public void queryBlogChoose() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap<>();
        map.put("views",500);
        map.put("title","五块钱如何花三天");
//        map.put("author","lgq");

        List<Blog> list = mapper.queryBlogChoose(map);
        System.out.println(list);

        sqlSession.close();
    }

    @Test
    public void updateBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap<>();
        map.put("title","我被修改了");
//        map.put("author","gj");
        map.put("id","110d759b6c98460d9643a57aff3509cc");

        mapper.updateBlog(map);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void queryBlogForeach() {

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        List<String> list = new ArrayList<>();
        list.add("110d759b6c98460d9643a57aff3509cc");
        list.add("993a2e110df04caca7f9f9b3dc7b7e19");

        map.put("ids",list);

        List<Blog> blogs = mapper.queryBlogForeach(map);
        System.out.println(blogs);

        sqlSession.close();
    }


}


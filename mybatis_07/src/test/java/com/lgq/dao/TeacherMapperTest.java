package com.lgq.dao;

import com.lgq.pojo.Teacher;
import com.lgq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Stack;

import static org.junit.Assert.*;

/**
 * @author lgq
 * @create 2020-12-25-10:22
 */
public class TeacherMapperTest {

    @Test
    public void getTeachers() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacherList = mapper.getTeachers();
        System.out.println(teacherList);
        sqlSession.close();
    }

    @Test
    public void getTeacherById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacherById(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void getTeacherById2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacherById2(1);
        System.out.println(teacher);
        sqlSession.close();
    }



}
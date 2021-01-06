package com.lgq.dao;

import com.lgq.pojo.Student;
import com.lgq.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author lgq
 * @create 2020-12-24-15:18
 */
public class StudentMapperTest {

    @Test
    public void getStudents() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = studentMapper.getStudents();
        System.out.println(studentList);
        sqlSession.close();
    }

    @Test
    public void getStudents2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = studentMapper.getStudents2();
        System.out.println(studentList);
        sqlSession.close();
    }

}
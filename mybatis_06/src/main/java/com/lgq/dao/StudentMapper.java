package com.lgq.dao;

import com.lgq.pojo.Student;

import java.util.List;

/**
 * @author lgq
 * @create 2020-12-23-15:11
 */
public interface StudentMapper {

    //查询所有的学生信息，以及对应的老师的信息
    List<Student> getStudents();

    List<Student> getStudents2();


}

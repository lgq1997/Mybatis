package com.lgq.dao;

import com.lgq.pojo.Student;
import com.lgq.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lgq
 * @create 2020-12-23-15:11
 */
public interface TeacherMapper {

    //获得所有老师
    List<Teacher> getTeachers();

    //获取指定老师及其所有学生
    Teacher getTeacherById(@Param("tid") int id);

    //获取指定老师及其所有学生
    Teacher getTeacherById2(@Param("tid") int id);



}

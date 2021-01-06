package com.lgq.dao;

import com.lgq.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lgq
 * @create 2020-12-23-15:11
 */
public interface TeacherMapper {
    //根据id查询老师
    Teacher getTeacherById(@Param("id") int id);
}

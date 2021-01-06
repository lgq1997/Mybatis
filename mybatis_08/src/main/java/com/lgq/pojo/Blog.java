package com.lgq.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author lgq
 * @create 2021-01-04-20:02
 */

@Data
public class Blog {//编写实体类
    private String id;
    private String title;
    private String author;
    private Date createTime;//属性名与数据库中字段名不一致
    private int views;
}

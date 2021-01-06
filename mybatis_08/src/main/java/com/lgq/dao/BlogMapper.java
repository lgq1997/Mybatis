package com.lgq.dao;
import com.lgq.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author lgq
 * @create 2021-01-04-20:05
 */
public interface BlogMapper {

    //插入数据
    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBlogIf(Map map);

    //查询语句
    List<Blog> queryBlogChoose(Map map);

    //更新博客
    int updateBlog(Map map);

    //查询第1,2,3号博客的记录
    List<Blog> queryBlogForeach(Map map);


}

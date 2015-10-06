package pengliu.blog.service;

import pengliu.blog.entities.BlogEntity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public interface BlogService
{
    Integer saveBlog(BlogEntity blog);
    Integer createBlog(String title, String content, Timestamp releaseTime, String releaseUser);
    List<BlogEntity> getAllBlog();
}

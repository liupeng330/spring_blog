package pengliu.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import pengliu.blog.dao.blog.BlogDao;
import pengliu.blog.entities.BlogEntity;
import pengliu.blog.service.BlogService;

import java.sql.Timestamp;
import java.util.List;

@Transactional
public class BlogImpl implements BlogService
{
    @Autowired
    BlogDao blogDao;

    public Integer createBlog(String title, String content, Timestamp releaseTime, String releaseUser)
    {
        BlogEntity blogEntity = new BlogEntity();
        blogEntity.setTitle(title);
        blogEntity.setContent(content);
        blogEntity.setReleaseTime(releaseTime);
        blogEntity.setRelaseUser(releaseUser);

        return (Integer)blogDao.save(blogEntity);
    }

    public List<BlogEntity> getAllBlog()
    {
        return blogDao.findAll(BlogEntity.class);
    }
}

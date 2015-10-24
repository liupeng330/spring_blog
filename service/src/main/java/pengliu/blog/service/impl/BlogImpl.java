package pengliu.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pengliu.blog.dao.blog.BlogDao;
import pengliu.blog.entities.BlogEntity;
import pengliu.blog.service.BlogService;

import java.sql.Timestamp;
import java.util.List;

@Service
@Transactional
public class BlogImpl implements BlogService
{
    @Autowired
    BlogDao blogDao;

    private boolean needToMock;

    public void setNeedToMock(boolean needToMock)
    {
        this.needToMock = needToMock;
    }

    public Integer saveBlog(BlogEntity blog)
    {
        if(needToMock)
        {
            blog.setTitle("this is mock!!");
        }
        return (Integer)this.blogDao.save(blog);
    }

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

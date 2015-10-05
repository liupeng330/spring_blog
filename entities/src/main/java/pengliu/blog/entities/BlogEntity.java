package pengliu.blog.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by peng on 10/5/15.
 */
@Entity
@Table(name = "blog", schema = "", catalog = "blog")
public class BlogEntity
{
    private Integer id;
    private String title;
    private String content;
    private Timestamp releaseTime;
    private String relaseUser;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    @Basic
    @Column(name = "content")
    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    @Basic
    @Column(name = "releaseTime")
    public Timestamp getReleaseTime()
    {
        return releaseTime;
    }

    public void setReleaseTime(Timestamp releaseTime)
    {
        this.releaseTime = releaseTime;
    }

    @Basic
    @Column(name = "relaseUser")
    public String getRelaseUser()
    {
        return relaseUser;
    }

    public void setRelaseUser(String relaseUser)
    {
        this.relaseUser = relaseUser;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogEntity that = (BlogEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (releaseTime != null ? !releaseTime.equals(that.releaseTime) : that.releaseTime != null) return false;
        if (relaseUser != null ? !relaseUser.equals(that.relaseUser) : that.relaseUser != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (releaseTime != null ? releaseTime.hashCode() : 0);
        result = 31 * result + (relaseUser != null ? relaseUser.hashCode() : 0);
        return result;
    }
}

package pengliu.blog.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pengliu.blog.entities.BlogEntity;
import pengliu.blog.service.BlogService;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

@Controller
@RequestMapping("/blog")
public class BlogController
{
    @Autowired
    BlogService blogService;

    @RequestMapping(value = {"/blog"}, method = RequestMethod.GET)
    public String createBlog(ModelMap modelMap)
    {
        modelMap.addAttribute("blogInfo", new BlogEntity());
        return "/blog/edit";
    }

    @RequestMapping(value = {"/blog"}, method = RequestMethod.POST)
    public String CreateBlog(ModelMap modelMap, BlogEntity blogInfo, BindingResult bindingResult)
    {
        blogInfo.setReleaseTime(new Timestamp(new Date().getTime()));
        blogService.saveBlog(blogInfo);
        modelMap.addAttribute("blogInfo", blogInfo);
        return "/blog/show";
    }
}

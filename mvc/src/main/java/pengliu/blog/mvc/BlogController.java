package pengliu.blog.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pengliu.blog.service.BlogService;

import java.sql.Timestamp;
import java.util.Date;

@Controller
@RequestMapping("/blog")
public class BlogController
{
    @Autowired
    BlogService blogService;

    @RequestMapping(value = {"/blog"},method = RequestMethod.GET)
    public String createBlog(@RequestParam("name") String name, ModelMap modelMap)
    {
        Integer result = blogService.createBlog("blog test", "this is content", new Timestamp(123), "my");
        modelMap.addAttribute("name", result);
        return "/blog/show";
    }
}

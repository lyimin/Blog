package blog.service.impl;

import blog.dao.BloggerDao;
import blog.entity.Blogger;
import blog.service.BloggerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yiming on 2017/6/9.
 */

@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService {

    @Resource
    private BloggerDao bloggerDao;

    public Blogger findBlogger(String userName) {
        return bloggerDao.findBlogger(userName);
    }
}

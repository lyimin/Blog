package blog.service;

import blog.entity.Blogger;

/**
 * Created by yiming on 2017/6/9.
 */
public interface BloggerService {
    public Blogger findBlogger(String userName);
}

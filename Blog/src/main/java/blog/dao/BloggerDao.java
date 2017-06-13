package blog.dao;

import blog.entity.Blogger;

/**
 * Created by yiming on 2017/6/6.
 */
public interface BloggerDao {

    /***
     * 根据userName查找博主信息
     */
    public Blogger findBlogger(String userName);
}




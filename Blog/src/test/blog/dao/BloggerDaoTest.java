package blog.dao;

import blog.BaseTest;
import blog.entity.Blogger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by yiming on 2017/6/7.
 */
public class BloggerDaoTest extends BaseTest {

    @Autowired
    private BloggerDao bloggerDao;

    @Test
    public void testFindBlogger() throws Exception {
        Blogger blogger = bloggerDao.findBlogger("eamon");
        System.out.print(blogger);
    }
}

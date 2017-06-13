package blog.web;

import blog.entity.Blogger;
import blog.service.BloggerService;
import blog.util.CryptographyUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by yiming on 2017/6/7.
 */

@Controller // 注册控制器bean
@RequestMapping(value = "/blogger")
public class BloggerController {

    @Resource
    private BloggerService blogggerService;

    @RequestMapping("/login")
    public String login(Blogger blogger, HttpServletRequest request) {

        // 获取当前登陆的主体
        Subject subject = SecurityUtils.getSubject();

        // 将密码使用md5加密
        String password = blogger.getPassword();

        // 将用户信息封装到token中，等会和数据库中查出的结果进行匹对
        UsernamePasswordToken token = new UsernamePasswordToken(blogger.getUserName(), password);

        try {
            // 会调用MyRealm中的doGetAuthenticationInfo方法进行身份认证
            subject.login(token);

            // 如果验证成功，则登录到后台博主管理主页
            return "redirect:/admin/main.jsp";
        } catch (AuthenticationException e) {
            e.printStackTrace();
            request.setAttribute("blogger", blogger);
            request.setAttribute("errorInfo", "用户名或密码错误");

            // 如果认证失败，则跳会登录页面并提示错误信息
            return "login";
        }
    }

}

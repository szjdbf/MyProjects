package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.ResultInfo;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.service.impl.UserServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/user/*")
public class UserServlet extends BaseServlet {

    //抽取共有的UserService
    private UserService userService = new UserServiceImpl();


    /**
     * 用户登录
     */
    public void login(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取参数
        Map<String, String[]> map = request.getParameterMap();
        //封装为User对象
        User user = new User();
        try {
            BeanUtils.populate(user, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //调用service查询
        User user0 = userService.login(user);
        ResultInfo info = new ResultInfo();
        if (user0 == null) {
            //用户名密码错误
            info.setFlag(false);
            info.setErrorMsg("用户名或密码错误");
        } else {
            //判断用户是否激活
            if ("Y".equals(user0.getStatus())) {
                //已经激活
                info.setFlag(true);
                //将用户的信息存放到session中
                request.getSession().setAttribute("user", user0);
                //info.setErrorMsg("登录成功");
            } else {
                //没有激活
                info.setFlag(false);
                info.setErrorMsg("尚未激活,请激活");
            }
        }

        //将信息转化为json字符串
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(info);
        //设置响应类型
        response.setContentType("text/json;charset=utf-8");
        //将字符串响应给浏览器
        response.getWriter().write(s);
    }

    /**
     * 用户注册
     */
    public void regist(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //校验验证码
        String check = request.getParameter("check");
        //从Session获取验证码
        Object checkcode_server = request.getSession().getAttribute("CHECKCODE_SERVER");
        //移除验证码
        request.getSession().removeAttribute("CHECKCODE_SERVER");
        if (checkcode_server != null && check.equalsIgnoreCase(checkcode_server.toString())) {
            //验证码正确
            //获取数据
            Map<String, String[]> map = request.getParameterMap();
            //封装对象
            User user = new User();
            try {
                BeanUtils.populate(user, map);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //调用UserService
            boolean flag = userService.regist(user);
            ResultInfo info = new ResultInfo();
            if (flag) {
                //注册成功
                info.setFlag(true);
            } else {
                info.setFlag(false);
                info.setErrorMsg("用户名已存在!");
            }

            //将info对象序列化为json
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(info);
            //将json数据写回客户端
            //设置响应格式
            response.setContentType("text/json;charset=utf-8");
            response.getWriter().write(json);
        } else {
            ResultInfo info = new ResultInfo();
            info.setFlag(false);
            info.setErrorMsg("验证码错误");
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(info);
            //将json数据写回客户端
            //设置响应格式
            response.setContentType("text/json;charset=utf-8");
            response.getWriter().write(json);
        }
    }

    /**
     * 激活账户
     */
    public void active(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取激活码
        String code = request.getParameter("code");
        if (code != null) {
            //调用UserService激活
            boolean flag = userService.active(code);
            String msg;
            if (flag) {
                //激活成功
                msg = "激活成功,请<a href='login.html'>登录</p>";
            } else {
                //激活失败
                msg = "激活失败";
            }
            response.getWriter().write(msg);
        }
    }

    /**
     * 用户退出
     */
    public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //用户退出,销毁session
        request.getSession().invalidate();
        //重定向到首页
        response.sendRedirect("/index.html");
    }

    /**
     * 获取用户名
     */
    public void getusername(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //从session中获取用户对象
        User user = (User) request.getSession().getAttribute("user");
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);
        response.setContentType("text/json;charset=utf-8");
        //将用户信息响应给浏览器
        response.getWriter().write(json);
    }

}

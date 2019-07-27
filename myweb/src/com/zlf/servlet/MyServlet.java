package com.zlf.servlet;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import com.zlf.po.Student;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet的生命周期
 * 1.加载实例化：当服务器启动或者第一次收到请求时，Servlet容器会将servlet加载到内存并通过反射创建servlet对象
 * 2.初始化：Servlet容器调用init方式对servlet进行初始化
 * 3.请求处理：当每次收到请求时，Servlet容器会调用service方法来处理请求
 * 4.销毁：服务器关闭时,Servlet容器会调用destory方法，并释放servlet实例
 */
@WebServlet(value = "/myservlet"/*, loadOnStartup = 0*//*服务器启动时加载servlet*/)
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //获取Cookie
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + " ---> " + cookie.getValue());
        }

        //将request对象的流转化为JSON对象
        JSONReader jr = new JSONReader(request.getReader());
        //将JSON对象转为Student对象
        Student s = jr.readObject(Student.class);
        //获取输出流
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        JSONObject j = new JSONObject();
        //判断用户名和密码是否正确
        if (s.getUsername().equals("张三") && s.getPassword().equals("123")) {
            //响应数据
            j.put("message", "登录成功");
            //将用户名和密码存放到cookie中
            Cookie c1 = new Cookie("username", s.getUsername());
            Cookie c2 = new Cookie("password", s.getPassword());
            //使用响应对象将用户名和信息存放到Cookie中
            c1.setMaxAge(60 * 60);
            c2.setMaxAge(60 * 60);
            response.addCookie(c1);
            response.addCookie(c2);
        } else {
            //响应数据
            j.put("message", "登录失败");
        }
        out.println(j);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }


    @Override
    public void init() {
        System.out.println("init()方法被调用...");
    }

//    @Override
//    public void service(ServletRequest req, ServletResponse res) {
//        System.out.println("service()方法被调用...");
//    }

    /**
     * 服务器会优先执行service方法,执行父类的service方法后,该方法会将ServletRequest和ServletResponse
     * 转换为HttpServletRequest和HttpServletResponse,调用重载的service,service判断请求方法调用doGet()/doPost()
     */

    @Override
    public void destroy() {
        System.out.println("destory()方法被调用...");
    }
}

package com.controller;

import com.entity.Users;
import com.service.UserService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/6/5
 * Time: 21:55
 */
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");//获取字符集解码
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        String email = request.getParameter("email");

        //创建spring容器
//        String config = "applicationContext.xml";
//        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        WebApplicationContext ac = null;
        //获取ServletContext中的容器对象，创建好的容器对象
//        ServletContext sc = getServletContext();
        ac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());


        UserService userService = (UserService) ac.getBean("userService");
        int result = userService.addUsers(new Users(userName, password, sex, email));

        System.out.println("result=" + result);
        if (result == 1) {
            request.getRequestDispatcher("/result.jsp").forward(request, response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

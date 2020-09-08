package com.neusoft.controller;

import com.neusoft.domain.User;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Eric Lee
 * @date 2020/9/8 10:11
 */
@Controller
@RequestMapping("/user")
public class UserController {

    // string 响应
    @RequestMapping("/testString")
    public String testString(Model model){
        User user = new User();
        // 假装么 这是调用service查出的结果
        user.setUsername("真好看");
        user.setPassword("123");
        user.setAge(13);
        // model 对象会存储在request中
        model.addAttribute("user", user);
        return "success";
    }
    // void 响应
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("testVoid.......");

        // 请求转发去响应 自己调用原生的必须 全路径
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);
//        response.sendRedirect(request.getContextPath()+"index.jsp");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");

        response.getWriter().write("你好完美");

        return;

    }

}

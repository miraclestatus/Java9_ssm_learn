package com.neusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Eric Lee
 * @date 2020/9/7 10:19
 */
//@Controller
//@RequestMapping(path="/user")
//public class HelloController {
//    @RequestMapping(path="/hello")
//    public String sayHello(){
//        System.out.println("Hello StringMVC");
//        return "success";
//    }
//
//}
// 控制器类
@Controller
@RequestMapping(path="/user")
public class HelloController {

    /**
     * 入门案例
     * @return
     */
    @RequestMapping(path="/hello")
    public String sayHello(){
        System.out.println("Hello StringMVC");
        return "success";
    }

    /**
     * RequestMapping注解
     * @return
     */
    @RequestMapping(value="/testRequestMapping",params = {"username=heihei"},headers = {"Accept"})
    public String testRequestMapping(){
        System.out.println("测试RequestMapping注解...");
        return "success";
    }

}
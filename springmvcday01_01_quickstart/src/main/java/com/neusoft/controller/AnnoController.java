package com.neusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Eric Lee
 * @date 2020/9/8 08:44
 */
@Controller
@RequestMapping("/anno")
public class AnnoController {

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name", required = false) String username,
                                   @RequestParam(value = "pass") String password){
        // 作用：把请求中的指定名称的参数传递给控制器中的形参赋值
//        2. 属性
//        1. value：请求参数中的名称
//        2. required：请求参数中是否必须提供此参数，默认值是true，必须提供
        // Message Required String parameter 'name' is not present
//    public String testRequestParam(@RequestParam("name") String username){
        System.out.println("testRequestParam");
        System.out.println(username);
        System.out.println(password);
        return "success";
    }


    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
//        用于获取请求体的内容（注意：get方法不可以）
//        2. 属性
//        1. required：是否必须有请求体，默认值是true
        System.out.println("RequestBody......");
        System.out.println(body); // username=admin&age=18
        return "success";
    }

    @RequestMapping("/testPathVarible/{sid}")
    public String testPathVarible(@PathVariable(name = "sid") String id){
        System.out.println("/testPathVarible");
        System.out.println(id);
        return "success";
    }





}

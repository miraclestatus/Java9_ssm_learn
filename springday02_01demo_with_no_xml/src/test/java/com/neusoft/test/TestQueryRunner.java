package com.neusoft.test;

import com.neusoft.config.SpringConfiguration;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

/**
 * @author Eric Lee
 * @date 2020/9/7 09:24
 */
public class TestQueryRunner {
    @Test
    public void testQueryRunner(){
        // 获取容器
   ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
   // 获取qr对象
        QueryRunner runner = ac.getBean("runner", QueryRunner.class);
        QueryRunner runner1 = ac.getBean("runner", QueryRunner.class);
        System.out.println(runner==runner1);



    }
}

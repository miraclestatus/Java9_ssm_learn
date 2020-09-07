package com.neusoft.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Eric Lee
 * @date 2020/9/7 08:55
 */
//spring全注解配置
// ComponentScan作用：指定spring创建容器时要扫的包
    // 属性： value 他和basePackages一样，
    // 等价于xml中配置<context:component-scan base-package="com.neusoft">
//    </context:component-scan>
//    Bean
    // 作用： 把当前方法的返回值作为Bean对象存入spring 的ioc容器中

//    细节：当我们使用 注解配置时， 如果方法有参数， spring去容器中查找
//    有没有可以用的bean对象， 查找的方式和Auto注解的作用是一样的




//@ComponentScan(basePackages="com.neusoft")
//@ComponentScan({"com.neusoft"})
@ComponentScan("com.neusoft")
@Import(JdbcConfig.class)
@PropertySource("classpath:jdbcConfig.properties")
public class SpringConfiguration {
}

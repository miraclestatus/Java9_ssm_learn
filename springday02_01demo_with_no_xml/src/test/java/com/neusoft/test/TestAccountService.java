package com.neusoft.test;

import com.neusoft.config.SpringConfiguration;
import com.neusoft.domain.Account;
import com.neusoft.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author Eric Lee
 * @date 2020/9/5 14:09
 */
//使用注解的方式加载junit单元测试
    // spring整理junit配置

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "bean.xml")
@ContextConfiguration(classes = SpringConfiguration.class)

public class TestAccountService {
    @Autowired
    private IAccountService as = null;


    @Test
    public void testFindAll() {

        //3.执行方法
        List<Account> accounts = as.findAllAccount();
        for(Account account : accounts){
            System.out.println(account);
        }
    }
//
//    @Test
//    public void testFindOne() {
//        //3.执行方法
//        Account account = as.findAccountById(1);
//        System.out.println(account);
//    }
//
//    @Test
//    public void testSave() {
//        Account account = new Account();
//        account.setName("test");
//        account.setMoney(12345f);
//        //3.执行方法
//        as.saveAccount(account);
//
//    }
//
//    @Test
//    public void testUpdate() {
//        //3.执行方法
//        Account account = as.findAccountById(4);
//        account.setMoney(23456f);
//        as.updateAccount(account);
//    }
//
//    @Test
//    public void testDelete() {
//        //3.执行方法
//        as.deleteAccount(4);
//    }
}

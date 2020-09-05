package com.neusoft.test;

import com.neusoft.domain.Account;
import com.neusoft.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Eric Lee
 * @date 2020/9/5 14:09
 */
public class TestAccountService {

    @Test
    public void testFindAll(){
       ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
       IAccountService as = ac.getBean("accountService", IAccountService.class);
        List<Account> allAccount = as.findAllAccount();
        for (Account account: allAccount){
            System.out.println(account);
        }
        
    }
}

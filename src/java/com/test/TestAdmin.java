package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.service.IAdminService;

/**
 * \Date: 2018/1/25
 * \
 * \Description:
 * \
 */
public class TestAdmin {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");

       IAdminService c=  context.getBean("adminServiceImpl",IAdminService.class);

       c.login();


    }
}

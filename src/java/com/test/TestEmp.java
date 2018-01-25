package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.vo.Emp;

/**
 * \Date: 2018/1/25
 * \
 * \Description:
 * \
 */
public class TestEmp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");

        Emp dept=context.getBean("emp", Emp.class);
        System.out.println(dept);
    }
}

package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.vo.Company;

/**
 * \Date: 2018/1/25
 * \
 * \Description:
 * \
 */
public class TestCompany {
    public static void main(String[] args) {
        ApplicationContext context=new  ClassPathXmlApplicationContext("spring-config.xml");

        Company company=context.getBean("company",Company.class);
        System.out.println(company);


    }
}

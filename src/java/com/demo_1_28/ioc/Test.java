package com.demo_1_28.ioc;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * \Date: 2018/1/28
 * \
 * \Description:
 * \
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class Test {


    @Autowired
    private ApplicationContext ctx;

    @Autowired
    private SomeBean someBean;

    @org.junit.Test
    public void test3() throws Exception{

       // ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ctx.getBean("someBean", SomeBean.class));

    }




}

package com.test_1_29.test2;

import com.demo_1_28.Hi;
import com.test_1_29.test2.controller.UserAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test(){


    }

    @Autowired
    private ApplicationContext ctx;
    @org.junit.Test
    public void test3() throws Exception{

        ctx=new ClassPathXmlApplicationContext("spring-config.xml");
        UserAction action=  ctx.getBean("userAction",UserAction.class);
        action.register();

    }

}

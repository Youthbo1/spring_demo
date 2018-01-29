package com.test_1_29.test2;

import com.test_1_29.test2.controller.UserAction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class T2 {

    @Autowired
    @Qualifier("userAction")
    private UserAction action;

    @Test
    public void test() throws Exception{
        action.register();
    }

    @Autowired
    private ApplicationContext ctx;
    @Test
    public void test2() throws Exception{
        ctx=new ClassPathXmlApplicationContext("spring-config.xml");
        UserAction action=ctx.getBean("userAction",UserAction.class);
        action.register();

    }




    @org.junit.Test
    public void test3() throws Exception{

        ctx=new ClassPathXmlApplicationContext("spring-config.xml");
        com.test_1_29.test2.controller.UserAction action=  ctx.getBean("userAction", com.test_1_29.test2.controller.UserAction.class);
        action.register();

    }

}

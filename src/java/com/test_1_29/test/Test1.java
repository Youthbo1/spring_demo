package com.test_1_29.test;

import com.demo_1_28.Hi;
import com.test_1_29.controller.UserAction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class Test1 {

    @Test
    public void test(){

    }

    @Autowired
    private UserAction action;
    @Test
    public void test3() throws Exception{

        action.register();

    }
}

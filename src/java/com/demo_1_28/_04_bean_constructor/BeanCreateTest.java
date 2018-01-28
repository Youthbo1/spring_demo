package com.demo_1_28._04_bean_constructor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * \Date: 2018/1/28
 * \
 * \Description:
 * \
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Configuration
public class BeanCreateTest {

    @Autowired
    private ApplicationContext ctx;

    @Test
    public void test()throws Exception{
        Hi hi=ctx.getBean("hi",Hi.class);

        System.out.println(hi);

    }
}

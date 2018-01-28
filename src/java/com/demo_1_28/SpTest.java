package com.demo_1_28;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
public class SpTest {

    @Autowired
    private  Hi b;
    @Test
    public void test()throws Exception{
        b.sayHi();
    }
}

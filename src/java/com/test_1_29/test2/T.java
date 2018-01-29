package com.test_1_29.test2;

import com.test_1_29.controller.UserAction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class T {

    @Autowired
    @Qualifier("userAction")
    private UserAction action;

    @Test
    public void test3() throws Exception{
        action.register();

    }


}

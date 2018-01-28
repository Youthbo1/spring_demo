package com.demo_1_28.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * \Date: 2018/1/28
 * \
 * \Description:
 * \
 */
@Component
public class SomeBean {

    @Autowired
    @Qualifier("otherBean")
   private OtherBean otherBean;


    @Override
    public String toString() {
        return "SomeBean{" +
                "otherBean=" + otherBean +
                '}';
    }
}

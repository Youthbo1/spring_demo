package com.demo_1_28.sp_container;

import com.demo_1_28.Hi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
public class Sp_container_Test {

    @Test
    public void test1() throws Exception{
     //   Resource resource= (Resource) new ClassPathResource("applicationContext.xml");
       // BeanFactory beanFactory =  new XmlBeanFactory();

    }

    @Test
    public void test2() throws Exception{

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Hi h=  context.getBean("hi",Hi.class);
        h.sayHi();

    }

    @Autowired
    private ApplicationContext ctx;
    @Test
    public void test3() throws Exception{

        ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        Hi h=  ctx.getBean("hi",Hi.class);
        h.sayHi();

    }


    @Autowired
    private Hi hi;
    @Test
    public void test4() throws Exception {

        hi.sayHi();
    }

}

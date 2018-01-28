package com.demo_1_28;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * \Date: 2018/1/28
 * \
 * \Description:
 * \
 */
public class App {

    @Test
    public void test1() throws Exception{
        Hi h=new Hi();
        h.sayHi();
    }


    @Test
    public void test2() throws Exception{
//        Resource resource= (Resource) new ClassPathResource("applicationContext.xml");
//        BeanFactory beanFactory =  new XmlBeanFactory();

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Hi h= (Hi) context.getBean("hi");

        h.sayHi();
    }

}

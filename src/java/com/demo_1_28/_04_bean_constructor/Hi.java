package com.demo_1_28._04_bean_constructor;

/**
 * \Date: 2018/1/28
 * \
 * \Description:
 * \
 */
public class Hi {

    public Hi() {
        System.out.println("---------无参构造-----");
    }

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public   void sayHi(){
        System.out.println("hi,spring    "+name);
    }
}

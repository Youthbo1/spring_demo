package com.vo;

/**
 * \Date: 2018/1/25
 * \
 * \Description:
 * \
 */
public class HelloWorld {
    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}

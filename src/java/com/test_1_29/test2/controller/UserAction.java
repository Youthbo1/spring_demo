package com.test_1_29.test2.controller;

import com.test_1_29.test.User;
import com.test_1_29.test2.service.IUserService;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("userAction")
@Scope("prototype")
public class UserAction {

    @Autowired
    @Qualifier("userService")
    private IUserService service;


    public void register(){
        System.out.println("注册");
        service.register(new User());
    }

//    public static void main(String[] args) {
//        new UserAction().register();
//    }
}

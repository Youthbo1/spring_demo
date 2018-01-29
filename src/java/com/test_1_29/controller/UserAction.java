package com.test_1_29.controller;

import com.test_1_29.test.User;
import com.test_1_29.service.IUserService;

public class UserAction {
    private IUserService service;

    public void setService(IUserService service) {
        this.service = service;
    }



    public void register(){
        System.out.println("注册");
        service.register(new User());
    }
}

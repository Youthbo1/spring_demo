package com.test_1_29.test2.service;

import com.test_1_29.test.User;
import com.test_1_29.test2.dao.IUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    @Qualifier("userDAO")
//    @Resource(name = "userDAO")
    private IUserDAO dao;


    @Override
    public void register(User user) {
        System.out.println("注册用户");
        dao.save(user);
    }
}

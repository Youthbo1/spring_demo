package com.test_1_29.service;

import com.test_1_29.test.User;
import com.test_1_29.dao.IUserDAO;

public class UserServiceImpl implements IUserService {

    private IUserDAO dao;

    public void setDao(IUserDAO dao) {
        this.dao = dao;
    }

    @Override
    public void register(User user) {
        System.out.println("注册用户");
        dao.save(user);
    }
}

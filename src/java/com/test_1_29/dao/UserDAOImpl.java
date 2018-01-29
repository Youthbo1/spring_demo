package com.test_1_29.dao;

import com.test_1_29.test.User;


public class UserDAOImpl implements IUserDAO {

    private String connection;

    public void setConnection(String connection) {
        this.connection = connection;
    }

    @Override
    public void save(User u) {
        System.out.println(connection);

        System.out.println("保存用户");
    }
}

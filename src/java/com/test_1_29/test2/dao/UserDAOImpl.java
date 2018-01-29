package com.test_1_29.test2.dao;

import com.test_1_29.test.User;
import org.springframework.stereotype.Repository;


@Repository("userDAO")
public class UserDAOImpl implements IUserDAO {

    private String connection="获取连接";

    @Override
    public void save(User u) {
        System.out.println(connection);

        System.out.println("保存用户");
    }
}

package com.dao.impl;

import com.dao.IAdminDAO;
import org.springframework.stereotype.Component;

/**
 * \Date: 2018/1/25
 * \
 * \Description:
 * \
 */
@Component
public class AdminDAOImpl implements IAdminDAO {
    public boolean findLogin() {

        System.out.println("IAdminDAO --  public boolean findLogin()");
        return true;
    }
}

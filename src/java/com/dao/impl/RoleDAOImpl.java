package com.dao.impl;

import com.dao.IRoleDAO;
import org.springframework.stereotype.Component;

/**
 * \Date: 2018/1/25
 * \
 * \Description:
 * \
 */
@Component
public class RoleDAOImpl implements IRoleDAO {
    public boolean findAll() {
        System.out.println("RoleDAOImpl--");
        return true;

    }
}

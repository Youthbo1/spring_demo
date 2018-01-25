package com.service;

import com.dao.IAdminDAO;
import com.dao.IRoleDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * \Date: 2018/1/25
 * \
 * \Description:
 * \
 */
@Service
public class AdminServiceImpl implements IAdminService {


    @Resource
    private IAdminDAO adminDAO;
    @Resource
    private IRoleDAO roleDAO;

    public boolean login() {
        this.adminDAO.findLogin();
        this.roleDAO.findAll();
        return false;
    }
}

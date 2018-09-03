package com.service;

import com.dao.UserDAO;
import com.dao.impl.UserDAOImpl;
import com.model.User;

import javax.annotation.Resource;

public class UserService {
    private UserDAO userDAO;

    public void init() {
        System.out.println("init");
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }
    @Resource(name = "u")
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void addUser(User user) {
        this.userDAO.save(user);
    }

    public void destory() {
        System.out.println("destory");
    }
}

package com.service;

import com.dao.UserDAO;
import com.dao.impl.UserDAOImpl;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;


public class UserService {
    private UserDAO userDAO;

    public void init() {
        System.out.println("init");
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    @Autowired
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

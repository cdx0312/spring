package com.service;

import com.dao.UserDAO;
import com.dao.impl.UserDAOImpl;
import com.model.User;

public class UserService {
    private UserDAO userDAO;

    public void init() {
        System.out.println("init");
    }

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

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

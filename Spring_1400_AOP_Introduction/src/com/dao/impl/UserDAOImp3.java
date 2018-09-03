package com.dao.impl;

import com.aop.LogInterceptor;
import com.dao.UserDAO;
import com.model.User;

public class UserDAOImp3 implements UserDAO{
    private UserDAO userDAO = new UserDAOImpl();

    @Override
    public void save(User user) {
        new LogInterceptor().beforeMethod(null);
        userDAO.save(user);
    }

    @Override
    public void delete() {

    }
}

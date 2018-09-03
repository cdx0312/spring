package com.dao.impl;

import com.dao.UserDAO;
import com.model.User;

public class UserDAOImpl implements UserDAO{
    @Override
    public void save(User user) {
        System.out.println("User saved!!!");
    }
}

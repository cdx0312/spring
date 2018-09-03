package com.dao.impl;

import com.dao.UserDAO;
import com.model.User;
import org.springframework.stereotype.Component;

@Component(value = "u")
public class UserDAOImpl implements UserDAO{
    @Override
    public void save(User user) {
        System.out.println("User saved!!!");
    }
}

package com.dao.impl;

import com.model.User;

public class UserDAOImp2 extends UserDAOImpl {
    @Override
    public void save(User user) {
        System.out.println("save started");
        super.save(user);
    }
}

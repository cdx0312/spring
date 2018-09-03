package com.dao.impl;

import com.dao.UserDAO;
import com.model.User;
import org.springframework.stereotype.Component;

@Component("u")
public class UserDAOImpl extends SuperDAO implements UserDAO{

    @Override
    public void save(User user) {
        this.getHibernateTemplate().save(user);
        System.out.println("User saved!!!");
    }

}

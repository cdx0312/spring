package com.registration.service.impl;

import com.registration.dao.UserDao;
import com.registration.dao.impl.UserDaoImpl;
import com.registration.model.User;
import com.registration.service.UserManager;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component("userManager")
public class UserManagerImpl implements UserManager {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }
    @Resource
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean exists(User user)throws Exception{
        return userDao.checkUserExistsWithName(user.getUsername());
    }

    @Override
    public void add(User user) throws Exception {
        userDao.save(user);
    }
}

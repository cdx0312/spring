package com.service;

import com.dao.UserDAO;
import com.dao.impl.UserDAOImpl;
import com.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component(value = "userService")
public class UserService {
    private UserDAO userDAO;
    @PostConstruct
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
    @PreDestroy
    public void destory() {
        System.out.println("destory");
    }
}

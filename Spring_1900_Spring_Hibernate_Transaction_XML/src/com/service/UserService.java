package com.service;

import com.dao.LogDAO;
import com.dao.UserDAO;
import com.dao.impl.UserDAOImpl;
import com.model.Log;
import com.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component(value = "userService")
public class UserService {
    private UserDAO userDAO;
    private LogDAO logDAO;

    public LogDAO getLogDAO() {
        return logDAO;
    }
    @Resource
    public void setLogDAO(LogDAO logDAO) {
        this.logDAO = logDAO;
    }

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

//    @Transactional(propagation = Propagation.REQUIRED)
    public void addUser(User user) {
        this.userDAO.save(user);
        Log log = new Log();
        log.setMsg("a use saved!!!");
        logDAO.save(log);
    }
    @PreDestroy
    public void destory() {
        System.out.println("destory");
    }
}

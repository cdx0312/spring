package com.registration.action;

import com.opensymphony.xwork2.ActionSupport;
import com.registration.model.User;
import com.registration.service.UserManager;
import com.registration.service.impl.UserManagerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("user")
@Scope("prototype")
public class UserAction extends ActionSupport{
    private String username;
    private String password;
    private String password2;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    private UserManager userManager;

    public UserManager getUserManager() {
        return userManager;
    }

    @Resource
    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    @Override
    public String execute() throws Exception {
        User user = new User(username, password);
        if (userManager.exists(user))
            return ERROR;
        userManager.add(user);
        return SUCCESS;
    }
}

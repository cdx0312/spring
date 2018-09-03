package com.registration.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.registration.dto.UserRegisterInfo;
import com.registration.model.User;
import com.registration.service.UserManager;
import com.registration.service.impl.UserManagerImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import sun.nio.cs.US_ASCII;

import javax.annotation.Resource;
import java.util.List;

public class UserAction extends ActionSupport implements ModelDriven {

    private UserRegisterInfo info = new UserRegisterInfo();

    private UserManager userManager;

    private List<User> users;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(UserManager um) {
        this.userManager = um;
    }

    @Override
    public String execute() throws Exception {
        User u = new User();
        u.setUsername(info.getUsername());
        u.setPassword(info.getPassword());
        if(userManager.exists(u)) {
            return "fail";
        }
        userManager.add(u);
        return "success";
    }

    public UserRegisterInfo getInfo() {
        return info;
    }

    public void setInfo(UserRegisterInfo info) {
        this.info = info;
    }

    //@Override
    public Object getModel() {
        return info;
    }

    public String list() {
        this.users = this.userManager.getUsers();
        return "list";
    }



    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String load() {
        this.user = this.userManager.loadById(info.getId());
        return "load";
    }


}


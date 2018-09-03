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

import javax.annotation.Resource;

@Component("user")
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven{
    private UserRegisterInfo info = new UserRegisterInfo();

    public UserRegisterInfo getInfo() {
        return info;
    }

    public void setInfo(UserRegisterInfo info) {
        this.info = info;
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
        User user = new User(info.getUsername(),info.getPassword());
        if (userManager.exists(user))
            return ERROR;
        userManager.add(user);
        return SUCCESS;
    }

    @Override
    public Object getModel() {
        return info;
    }
}

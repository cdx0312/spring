package com.registration.service;

import com.registration.model.User;

import java.util.List;

public interface UserManager {
    public abstract boolean exists(User user)throws Exception;

    public abstract void add(User user) throws Exception;

    public List<User> getUsers();
}

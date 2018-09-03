package com.registration.dao;

import com.registration.model.User;

import java.util.List;

public interface UserDao {
    public void save(User user);
    public boolean checkUserExistsWithName(String useraname);
    public List<User> getUsers();
}

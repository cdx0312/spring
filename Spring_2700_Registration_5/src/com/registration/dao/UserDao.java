package com.registration.dao;

import com.registration.model.User;

public interface UserDao {
    public void save(User user);
    public boolean checkUserExistsWithName(String useraname);
}

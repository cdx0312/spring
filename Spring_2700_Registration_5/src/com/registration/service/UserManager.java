package com.registration.service;

import com.registration.model.User;

public interface UserManager {
    boolean exists(User user)throws Exception;

    void add(User user) throws Exception;
}

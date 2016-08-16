package com.lanxi.service;

import com.lanxi.entity.User;

/**
 * Created by summer on 16-8-12.
 */
public interface IUserService {

    User login(String username, String password);
    int register(User user);
    User getById(int id);
    boolean update(User user);
}

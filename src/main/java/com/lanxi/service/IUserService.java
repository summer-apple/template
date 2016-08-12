package com.lanxi.service;

import com.lanxi.entity.User;

/**
 * Created by summer on 16-8-12.
 */
public interface IUserService {



    boolean login(String username, String password);
    boolean register(User user);
    User getById(int id);
}

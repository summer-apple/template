package com.lanxi.service.impl;

import com.lanxi.dao.UserMapper;
import com.lanxi.entity.User;
import com.lanxi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by summer on 16-8-12.
 */

@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public boolean register(User user) {
        return false;
    }

    @Override
    public User getById(int id) {
        return null;
    }
}

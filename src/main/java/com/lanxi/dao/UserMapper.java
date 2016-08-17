package com.lanxi.dao;

import com.lanxi.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    int checkUsername(String username);
    User checkPassword(String username,String passowrd);
    int addUser(User user);
    User getUserById(int id);
    boolean update(User user);


}
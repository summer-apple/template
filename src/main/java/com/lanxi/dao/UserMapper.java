package com.lanxi.dao;

import com.lanxi.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {

    int checkUsername(String username);
    User checkPassword(String username,String passowrd);
    User getUserById(int id);


}
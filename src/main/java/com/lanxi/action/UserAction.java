package com.lanxi.action;

import com.lanxi.entity.User;
import com.lanxi.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by summer on 16-8-11.
 */
@RestController
@RequestMapping("/user")
public class UserAction {

    @Autowired
    UserService userService;


    /**
     *  非restful参数传递
     * @param name
     * @return
     */
    @RequestMapping("/test")
    public String test(String name){
        return "Hello " + name;
    }

    @RequestMapping("/get-user")
    public User getUserById(int id){
        return userService.getById(id);
    }


    @RequestMapping("/login")
    public User login(String username, String password){
        return userService.login(username,password);
    }


    @RequestMapping("/update")
    public boolean update(int id,String username, String password){
        return userService.update(new User(id,username,password));
    }

    @RequestMapping("/register")
    public int register(User user){
        return userService.register(user);
    }


}

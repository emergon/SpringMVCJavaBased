package com.emergon.service;

import com.emergon.entities.User;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    
    public User validateUser(User user){
        String username = user.getUsername();
        String password = user.getPassword();
        boolean result = username.equals("admin") && password.equals("1234");
        if(result == true){
            return user;
        }
        return null;
    }
}

package com.emergon.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    
    public boolean validateUser(String username, String password){
        boolean result = username.equals("admin") && password.equals("1234");
        return result;
    }
}

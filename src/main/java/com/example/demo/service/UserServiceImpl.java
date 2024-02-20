package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getListUser() {
        List<User> listUser = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setId(i);
            user.setName("name " + i);
            user.setUserName("user name " + i);
            listUser.add(user);
        }

        return listUser;
    }
    
}

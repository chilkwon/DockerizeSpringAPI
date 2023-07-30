package com.example.springapi.service;

import com.example.springapi.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> userList;

    public UserService(){
        userList = new ArrayList<>();
        userList.add(new User(1L,"John Doe","joh@example.com"));
        userList.add(new User(2L,"Alice Smith","alice@example.com"));
        userList.add(new User(3L,"Bob John","bob@example.com"));
    }

    public List<User> getAllUsers(){
        return userList;
    }

    public User getUserById(Long id){
        return userList.stream().
                filter(user->user.getId().equals(id))
                .findFirst()
                .orElse(null);

    }

}

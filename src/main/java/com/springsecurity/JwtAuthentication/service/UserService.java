package com.springsecurity.JwtAuthentication.service;

import com.springsecurity.JwtAuthentication.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Kartik Tayde", "kartik@dev.in"));
        store.add(new User(UUID.randomUUID().toString(), "Siddhant Singh", "sid@dev.in"));
        store.add(new User(UUID.randomUUID().toString(), "Prajwal Deshmukh", "prajwal@dev.in"));
        store.add(new User(UUID.randomUUID().toString(), "Rohan Tayde", "rohan@dev.in"));
    }

    public List<User> getUsers(){
        return this.store;
    }

}

package com.example.service;

import com.example.entity.User;

public interface UserService {

    User getUserById(int id);

    Integer insertUser(User user);
}

package com.example.service;

import com.example.entity.User;

import java.util.List;

public interface UserService {

    User getUserById(int id);

    Integer insertUser(User user);

    List<User> getUserList();

    User getUserInfo(User user);

    Integer updataUserInfo(User user);

    Integer deleteUserInfo(User user);
}

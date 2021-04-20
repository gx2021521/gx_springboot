package com.example.service.impl;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author admin
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        User userInfo = userMapper.getUserById(id);
        return userInfo;
    }

    @Override
    public Integer insertUser(User user) {
        int insertNum = userMapper.insert(user);
        return insertNum;
    }
}

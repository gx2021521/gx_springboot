package com.example.service.impl;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<User> getUserList() {
        return userMapper.selectAll();
    }

    @Override
    public User getUserInfo(User user) {
        return userMapper.selectOne(user);
    }

    @Override
    public Integer updataUserInfo(User user) {
        return userMapper.updateByPrimaryKey(user);
    }

    @Override
    public Integer deleteUserInfo(User user) {
        return userMapper.deleteByPrimaryKey(user);
    }
}

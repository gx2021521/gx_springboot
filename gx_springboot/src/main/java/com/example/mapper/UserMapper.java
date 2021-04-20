package com.example.mapper;

import com.example.entity.User;
import com.example.baseMapper.BaseMapper;

public interface UserMapper extends BaseMapper<User> {

    User getUserById(int id);
}

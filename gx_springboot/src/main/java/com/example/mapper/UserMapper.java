package com.example.mapper;

import com.example.entity.User;
import com.example.baseMapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {

    User getUserById(String id);

    User getInfoByUsername(@Param("user") User user);
}

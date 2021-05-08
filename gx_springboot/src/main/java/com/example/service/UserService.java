package com.example.service;

import com.example.entity.User;
import com.example.utils.resultFormat.Result;
import com.github.pagehelper.PageResult;

public interface UserService {

    User getUserById(String id);
    //根据用户名查询信息
    User getInfoByUsername(User user);

    /**通用mapper查询全部*/
    PageResult<User> getAllUser();
    /**通用mapper条件查询*/
    Result<User> getUserInfo(User user);
    /**通用mapper新增*/
    Result<Integer> insertUser(User user);
    /**通用mapper更新*/
    Result<Integer> updataUserInfo(User user);
    /**通用mapper删除*/
    Result<Integer> deleteUserInfo(User user);


}

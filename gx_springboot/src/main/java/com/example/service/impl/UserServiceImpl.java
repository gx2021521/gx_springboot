package com.example.service.impl;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import com.example.utils.resultFormat.Result;
import com.example.utils.resultFormat.ResultUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageResult;
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
    public Result<User> getUserById(int id) {
        User userInfo = userMapper.getUserById(id);
        return ResultUtil.success(userInfo);
    }

    /**通用mapper查询全部*/
    @Override
    public PageResult<User> getAllUser() {
        PageHelper.startPage(1,2);
        List<User> users = userMapper.selectAll();
        return new PageResult(users);
    }
    /**通用mapper条件查询*/
    @Override
    public Result<User> getUserInfo(User user) {
        return ResultUtil.success(userMapper.selectOne(user));
    }
    /**通用mapper新增*/
    @Override
    public Result<Integer> insertUser(User user) {
        int insertNum = userMapper.insert(user);
        return ResultUtil.success(insertNum);
    }
    /**通用mapper更新*/
    @Override
    public Result<Integer> updataUserInfo(User user) {
        return ResultUtil.success(userMapper.updateByPrimaryKey(user));
    }
    /**通用mapper删除*/
    @Override
    public Result<Integer> deleteUserInfo(User user) {
        return ResultUtil.success(userMapper.deleteByPrimaryKey(user));
    }
}

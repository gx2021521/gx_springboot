package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import com.example.utils.resultFormat.Result;
import com.github.pagehelper.PageResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Api("User接口")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据id查找
     * @param id
     * @return
     */

    @ApiOperation("根据用户id获取用户信息")
    @RequestMapping("/getUserById/{id}")
    public User getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    /**
     * 通用mapper查询全部
     * @param
     * @return
     */
    @ApiOperation("通用mapper查询全部用户信息")
    @GetMapping("/getAllUser")
    public PageResult<User> getAllUser() {
        PageResult<User> userList = userService.getAllUser();
        return userList;
    }
    /**
     * 通用mapper条件查询
     * @param user
     * @return
     */
    @ApiOperation("通用mapper条件查询查询用户信息")
    @PostMapping("/getUserById")
    public Result<User>  getUserInfo(@RequestBody User user) {
        return userService.getUserInfo(user);
    }
    /**
     * 通用mapper新增
     * @param user
     * @return
     */
    @ApiOperation("通用mapper新增用户信息")
    @PostMapping("/insertUser")
    public Result<Integer> insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }
    /**
     * 通用mapper更新
     * @param user
     * @return
     */
    @ApiOperation("通用mapper更新用户信息")
    @PostMapping("/updataUserInfo")
    public Result<Integer> updataUserInfo(@RequestBody User user) {
        return userService.updataUserInfo(user);
    }

    /**
     * 通用mapper删除
     * @param user
     * @return
     */
    @ApiOperation("通用mapper删除用户信息")
    @PostMapping("/deleteUserInfo")
    public Result<Integer> deleteUserInfo(@RequestBody User user) {
        return userService.deleteUserInfo(user);
    }
}

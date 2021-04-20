package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import com.example.utils.resultFormat.Result;
import com.github.pagehelper.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据id查找
     * @param id
     * @return
     */
    @RequestMapping("/getUserById/{id}")
    public Result<User> getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    /**
     * 通用mapper查询全部
     * @param
     * @return
     */
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
    @PostMapping("/getUserById")
    public Result<User>  getUserInfo(@RequestBody User user) {
        return userService.getUserInfo(user);
    }
    /**
     * 通用mapper新增
     * @param user
     * @return
     */
    @PostMapping("/insertUser")
    public Result<Integer> insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }
    /**
     * 通用mapper更新
     * @param user
     * @return
     */
    @PostMapping("/updataUserInfo")
    public Result<Integer> updataUserInfo(@RequestBody User user) {
        return userService.updataUserInfo(user);
    }

    /**
     * 通用mapper删除
     * @param user
     * @return
     */
    @PostMapping("/deleteUserInfo")
    public Result<Integer> deleteUserInfo(@RequestBody User user) {
        return userService.deleteUserInfo(user);
    }
}

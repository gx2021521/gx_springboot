package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import com.example.utils.resultFormat.Result;
import com.example.utils.resultFormat.ResultUtil;
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
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    /**
     * 通用mapper查询全部
     * @param
     * @return
     */
    @GetMapping("/getUserList")
    public Result<User> getUserList() {
        return ResultUtil.success(userService.getUserList());
    }
    /**
     * 通用mapper条件查询
     * @param user
     * @return
     */
    @PostMapping("/getUserById")
    public User getUserInfo(@RequestBody User user) {
        return userService.getUserInfo(user);
    }
    /**
     * 通用mapper新增
     * @param user
     * @return
     */
    @PostMapping("/insertUser")
    public Integer insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }
    /**
     * 通用mapper更新
     * @param user
     * @return
     */
    @PostMapping("/updataUserInfo")
    public Integer updataUserInfo(@RequestBody User user) {
        return userService.updataUserInfo(user);
    }

    /**
     * 通用mapper删除
     * @param user
     * @return
     */
    @PostMapping("/deleteUserInfo")
    public Integer deleteUserInfo(@RequestBody User user) {
        return userService.deleteUserInfo(user);
    }
}

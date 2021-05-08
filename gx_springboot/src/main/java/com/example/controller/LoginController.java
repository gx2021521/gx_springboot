package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import com.example.utils.token.TokenService;
import com.example.utils.token.UserLoginToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;

@RestController
@RequestMapping("/loginController")
public class LoginController {
    @Autowired
    UserService userService;
    @Autowired
    TokenService tokenService;

    //登录
    @PostMapping("/login")
    public LinkedHashMap<String, Object> login(@RequestBody User user) {
        LinkedHashMap<String, Object> jsonObject = new LinkedHashMap<>();
        User userForBase = userService.getInfoByUsername(user);
        if (userForBase == null) {
            jsonObject.put("message", "登录失败,用户不存在");
            return jsonObject;
        } else {
            if (!userForBase.getPassWord().equals(user.getPassWord())) {
                jsonObject.put("message", "登录失败,密码错误");
                return jsonObject;
            } else {
                String token = tokenService.getToken(userForBase);
                jsonObject.put("token", token);
                jsonObject.put("user", userForBase);
                return jsonObject;
            }
        }
    }

    @UserLoginToken
    @GetMapping("/getMessage")
    public String getMessage() {
        return "你已通过验证";
    }
}

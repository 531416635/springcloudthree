package com.yao.controller;

import com.alibaba.fastjson.JSONObject;
import com.yao.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value="查询用户信息", notes="查询用户信息")
    @RequestMapping(value = "/userInfo",method = RequestMethod.GET)
    public JSONObject selectAll(){
        return userService.selectAll();
    }
}

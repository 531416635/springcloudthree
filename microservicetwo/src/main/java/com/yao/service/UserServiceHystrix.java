package com.yao.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class UserServiceHystrix implements UserService{
    @Override
    public JSONObject selectAll() {
        JSONObject json = new JSONObject();
        json.put("msg","查询用户信息失败！");
        return json;
    }

    @Override
    public JSONObject insertUser() {
        JSONObject json = new JSONObject();
        json.put("msg","插入用户信息失败！");
        return json;
    }
}

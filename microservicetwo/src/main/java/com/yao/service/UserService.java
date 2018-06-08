package com.yao.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "microserviceone",fallback = UserServiceHystrix.class)
public interface UserService {

    @RequestMapping(value = "/userInfo/selectAll.do",method = RequestMethod.GET)
    JSONObject selectAll();

    @RequestMapping(value = "/userInfo/insertUser.do",method = RequestMethod.GET)
    JSONObject insertUser();


}

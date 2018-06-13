package com.yao.controller;

import com.alibaba.fastjson.JSONObject;
import com.yao.model.UserInfoModel;
import com.yao.service.UserInfoService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/userInfo")
@RestController
public class UserInfoController {

    private static Logger logger = LoggerFactory.getLogger(UserInfoController.class);
    @Autowired
    UserInfoService service;



    /**
     * 插入数据
     * @param model
     * @return
     */
    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @ApiImplicitParam(name = "model", value = "用户详细实体user", required = true, dataType = "UserInfoModel")
    @RequestMapping(value = "/insertUser",method = RequestMethod.PUT)
    public JSONObject insertUser(UserInfoModel model){
        JSONObject json = new JSONObject();
        json.put("code","-1");
        try {
            json.put("result",service.insert(model));
            json.put("code","1");
        }catch (Exception e){
            e.printStackTrace();
        }
        return json;
    }

    /**
     * 查询数据
     * @return
     */
    @ApiOperation(value="查询用户信息", notes="查询用户信息")
    @RequestMapping(value = "/selectAll",method = RequestMethod.GET)
    public JSONObject selectAll(){
        JSONObject json = new JSONObject();
        json.put("code","-1");
        try {
            json.put("result",service.selectAll());
            json.put("code","1");
        }catch (Exception e){
            e.printStackTrace();
        }
        logger.info("查询数据{}",JSONObject.toJSONString(json));
        return json;
    }
}

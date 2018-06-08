package com.yao.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yao.dao.UserInfoModelMapper;
import com.yao.model.UserInfoModel;
import com.yao.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoModelMapper dao;
    /**
     * @param record
     * @mbg.generated 2018-06-03
     */
    @Override
    public int insert(UserInfoModel record) {
        return dao.insert(record);
    }

    /**
     * @param record
     * @mbg.generated 2018-06-03
     */
    @Override
    public int insertSelective(UserInfoModel record) {
        return 0;
    }

    /**
     * 查询全部数据
     *
     * @return
     */
    @HystrixCommand(fallbackMethod = "selectAllHystrix")
    @Override
    public List<UserInfoModel> selectAll() {
        return dao.selectAll();
    }

    public List<UserInfoModel> selectAllHystrix(){
        List<UserInfoModel> list = new ArrayList<>();
        return  list;
    }
}

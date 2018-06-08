package com.yao.service;

import com.yao.model.UserInfoModel;

import java.util.List;

public interface UserInfoService {
    /**
     *
     * @mbg.generated 2018-06-03
     */
    int insert(UserInfoModel record);

    /**
     *
     * @mbg.generated 2018-06-03
     */
    int insertSelective(UserInfoModel record);

    /**
     * 查询全部数据
     * @return
     */
    List<UserInfoModel> selectAll();

}

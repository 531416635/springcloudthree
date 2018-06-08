package com.yao.dao;

import com.yao.model.UserInfoModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserInfoModelMapper {
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
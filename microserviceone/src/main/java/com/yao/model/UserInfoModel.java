package com.yao.model;

import java.util.Date;

public class UserInfoModel {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 身份证号码
     */
    private String idCard;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 预留字段1
     */
    private String param1;

    /**
     * 预留字段2
     */
    private String param2;

    /**
     * 自增主键
     * @return id 自增主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 自增主键
     * @param id 自增主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 用户名
     * @return user_name 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 手机号码
     * @return phone 手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号码
     * @param phone 手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 身份证号码
     * @return id_card 身份证号码
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 身份证号码
     * @param idCard 身份证号码
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 预留字段1
     * @return param1 预留字段1
     */
    public String getParam1() {
        return param1;
    }

    /**
     * 预留字段1
     * @param param1 预留字段1
     */
    public void setParam1(String param1) {
        this.param1 = param1 == null ? null : param1.trim();
    }

    /**
     * 预留字段2
     * @return param2 预留字段2
     */
    public String getParam2() {
        return param2;
    }

    /**
     * 预留字段2
     * @param param2 预留字段2
     */
    public void setParam2(String param2) {
        this.param2 = param2 == null ? null : param2.trim();
    }
}
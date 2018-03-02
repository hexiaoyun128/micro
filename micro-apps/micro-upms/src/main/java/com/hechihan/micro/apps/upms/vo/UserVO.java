package com.hechihan.micro.apps.upms.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserVO implements Serializable{
    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 别名
     */
    private String alias;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 有效
     */
    private Boolean active;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建者
     */
    private Integer createUid;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新者
     */
    private Integer updateUid;

    /**
     * 公司用户
     */
    private Boolean isCompany;

    /**
     * 供应商用户
     */
    private Boolean isSupplier;

    /**
     * 客户用户
     */
    private Boolean isCustomer;

    /**
     * 公司管理员
     */
    private Boolean companySupper;

    /**
     * 系统管理员
     */
    private Boolean systemSupper;

    /**
     * 电话号码
     */
    private String telPhone;

    /**
     * 手机号码
     */
    private String mobilePhone;

    /**
     * QQ
     */
    private String qq;

    /**
     * 微信
     */
    private String wechat;

    /**
     * 所属公司
     */
    private CompanyVO company;

    /**
     * 所属部门
     */
    private Integer departmentId;

    /**
     * 职位
     */
    private Integer posistionId;


}
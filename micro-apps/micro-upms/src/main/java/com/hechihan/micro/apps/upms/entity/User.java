package com.hechihan.micro.apps.upms.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Data
public class User implements Serializable {
    /**
     * 主键
     */
    @Id
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
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建者
     */
    @Column(name = "create_uid")
    private Integer createUid;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新者
     */
    @Column(name = "update_uid")
    private Integer updateUid;

    /**
     * 公司用户
     */
    @Column(name = "is_company")
    private Boolean isCompany;

    /**
     * 供应商用户
     */
    @Column(name = "is_supplier")
    private Boolean isSupplier;

    /**
     * 客户用户
     */
    @Column(name = "is_customer")
    private Boolean isCustomer;

    /**
     * 公司管理员
     */
    @Column(name = "company_supper")
    private Boolean companySupper;

    /**
     * 系统管理员
     */
    @Column(name = "system_supper")
    private Boolean systemSupper;

    /**
     * 电话号码
     */
    @Column(name = "tel_phone")
    private String telPhone;

    /**
     * 手机号码
     */
    @Column(name = "mobile_phone")
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
    private Company company;

    /**
     * 所属部门
     */
    private Department department;

    /**
     * 职位
     */
    private Position position;
    /**
     * 用户角色集合
     */
    private List<UserRole> roleList;


}
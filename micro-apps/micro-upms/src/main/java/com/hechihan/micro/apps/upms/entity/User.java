package com.hechihan.micro.apps.upms.entity;

import java.util.Date;
import javax.persistence.*;

public class User {
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
    @Column(name = "company_id")
    private Integer companyId;

    /**
     * 所属部门
     */
    @Column(name = "department_id")
    private Integer departmentId;

    /**
     * 职位
     */
    @Column(name = "posistion_id")
    private Integer posistionId;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取别名
     *
     * @return alias - 别名
     */
    public String getAlias() {
        return alias;
    }

    /**
     * 设置别名
     *
     * @param alias 别名
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取有效
     *
     * @return active - 有效
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * 设置有效
     *
     * @param active 有效
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建者
     *
     * @return create_uid - 创建者
     */
    public Integer getCreateUid() {
        return createUid;
    }

    /**
     * 设置创建者
     *
     * @param createUid 创建者
     */
    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取更新者
     *
     * @return update_uid - 更新者
     */
    public Integer getUpdateUid() {
        return updateUid;
    }

    /**
     * 设置更新者
     *
     * @param updateUid 更新者
     */
    public void setUpdateUid(Integer updateUid) {
        this.updateUid = updateUid;
    }

    /**
     * 获取公司用户
     *
     * @return is_company - 公司用户
     */
    public Boolean getIsCompany() {
        return isCompany;
    }

    /**
     * 设置公司用户
     *
     * @param isCompany 公司用户
     */
    public void setIsCompany(Boolean isCompany) {
        this.isCompany = isCompany;
    }

    /**
     * 获取供应商用户
     *
     * @return is_supplier - 供应商用户
     */
    public Boolean getIsSupplier() {
        return isSupplier;
    }

    /**
     * 设置供应商用户
     *
     * @param isSupplier 供应商用户
     */
    public void setIsSupplier(Boolean isSupplier) {
        this.isSupplier = isSupplier;
    }

    /**
     * 获取客户用户
     *
     * @return is_customer - 客户用户
     */
    public Boolean getIsCustomer() {
        return isCustomer;
    }

    /**
     * 设置客户用户
     *
     * @param isCustomer 客户用户
     */
    public void setIsCustomer(Boolean isCustomer) {
        this.isCustomer = isCustomer;
    }

    /**
     * 获取公司管理员
     *
     * @return company_supper - 公司管理员
     */
    public Boolean getCompanySupper() {
        return companySupper;
    }

    /**
     * 设置公司管理员
     *
     * @param companySupper 公司管理员
     */
    public void setCompanySupper(Boolean companySupper) {
        this.companySupper = companySupper;
    }

    /**
     * 获取系统管理员
     *
     * @return system_supper - 系统管理员
     */
    public Boolean getSystemSupper() {
        return systemSupper;
    }

    /**
     * 设置系统管理员
     *
     * @param systemSupper 系统管理员
     */
    public void setSystemSupper(Boolean systemSupper) {
        this.systemSupper = systemSupper;
    }

    /**
     * 获取电话号码
     *
     * @return tel_phone - 电话号码
     */
    public String getTelPhone() {
        return telPhone;
    }

    /**
     * 设置电话号码
     *
     * @param telPhone 电话号码
     */
    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    /**
     * 获取手机号码
     *
     * @return mobile_phone - 手机号码
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * 设置手机号码
     *
     * @param mobilePhone 手机号码
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * 获取QQ
     *
     * @return qq - QQ
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置QQ
     *
     * @param qq QQ
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * 获取微信
     *
     * @return wechat - 微信
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * 设置微信
     *
     * @param wechat 微信
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    /**
     * 获取所属公司
     *
     * @return company_id - 所属公司
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * 设置所属公司
     *
     * @param companyId 所属公司
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取所属部门
     *
     * @return department_id - 所属部门
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置所属部门
     *
     * @param departmentId 所属部门
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取职位
     *
     * @return posistion_id - 职位
     */
    public Integer getPosistionId() {
        return posistionId;
    }

    /**
     * 设置职位
     *
     * @param posistionId 职位
     */
    public void setPosistionId(Integer posistionId) {
        this.posistionId = posistionId;
    }
}
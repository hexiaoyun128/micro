package com.hechihan.micro.apps.upms.entity;

import java.util.Date;
import javax.persistence.*;

public class Department {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 上级部门
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 所属公司
     */
    @Column(name = "company_id")
    private Integer companyId;

    /**
     * 部门经理ID(用户)
     */
    @Column(name = "manager_id")
    private Integer managerId;

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
     * 获取部门名称
     *
     * @return name - 部门名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置部门名称
     *
     * @param name 部门名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取上级部门
     *
     * @return parent_id - 上级部门
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置上级部门
     *
     * @param parentId 上级部门
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
     * 获取部门经理ID(用户)
     *
     * @return manager_id - 部门经理ID(用户)
     */
    public Integer getManagerId() {
        return managerId;
    }

    /**
     * 设置部门经理ID(用户)
     *
     * @param managerId 部门经理ID(用户)
     */
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
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
}
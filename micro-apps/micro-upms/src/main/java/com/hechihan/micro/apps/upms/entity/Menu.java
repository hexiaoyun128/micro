package com.hechihan.micro.apps.upms.entity;

import java.util.Date;
import javax.persistence.*;

public class Menu {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 父菜单
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单路径
     */
    private String path;

    /**
     * web体现为class
     */
    private String clazz;

    /**
     * 排列序号
     */
    private Integer sequence;

    /**
     * 类型
     */
    private String type;

    /**
     * 有效
     */
    private Boolean active;

    /**
     * 备注
     */
    private String remark;

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
     * 获取父菜单
     *
     * @return parent_id - 父菜单
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置父菜单
     *
     * @param parentId 父菜单
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取菜单名称
     *
     * @return name - 菜单名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置菜单名称
     *
     * @param name 菜单名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取菜单路径
     *
     * @return path - 菜单路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置菜单路径
     *
     * @param path 菜单路径
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取web体现为class
     *
     * @return clazz - web体现为class
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * 设置web体现为class
     *
     * @param clazz web体现为class
     */
    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    /**
     * 获取排列序号
     *
     * @return sequence - 排列序号
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * 设置排列序号
     *
     * @param sequence 排列序号
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
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
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
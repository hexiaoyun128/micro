package com.hechihan.micro.apps.upms.entity;

import java.util.Date;
import javax.persistence.*;

public class Action {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 操作编号
     */
    private String code;

    /**
     * 操作名称
     */
    private String name;

    /**
     * 所属菜单
     */
    @Column(name = "menu_id")
    private Integer menuId;

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
     * 获取操作编号
     *
     * @return code - 操作编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置操作编号
     *
     * @param code 操作编号
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取操作名称
     *
     * @return name - 操作名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置操作名称
     *
     * @param name 操作名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取所属菜单
     *
     * @return menu_id - 所属菜单
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 设置所属菜单
     *
     * @param menuId 所属菜单
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
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
}
package com.hechihan.micro.apps.upms.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Data
public class Company  implements Serializable{
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 公司名称
     */
    private String name;

    /**
     * 母公司
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 区县
     */
    private String district;

    /**
     * 街道
     */
    private String street;

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
     * 上级公司对象
     *
     */
    @Transient
    private Company parent;

}
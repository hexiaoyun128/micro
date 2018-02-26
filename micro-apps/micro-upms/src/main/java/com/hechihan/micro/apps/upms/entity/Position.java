/**
 * @author: cloudy  Date: 2018/2/3 Time: 9:57
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */
package com.hechihan.micro.apps.upms.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Data
@Entity
@Table(name = "position")
public class Position implements Serializable {
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(name = "主键", allowEmptyValue = true)
    private Integer id;

    /**
     * 职位名称
     */
    @ApiModelProperty(name = "职位名称")
    private String name;

    /**
     * 部门
     */
    @ApiModelProperty(name = "部门")
    @Column(name = "department_id")
    private Integer departmentId;
    /**
     * 职位说明
     */
    @ApiModelProperty(name = "职位说明")
    @Column(name = "description",nullable = true)
    private String description;
    /**
     * 创建时间
     */
    @ApiModelProperty(name = "创建时间")
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建者
     */
    @ApiModelProperty(name = "创建者")
    @Column(name = "create_uid")
    private Integer createUid;

    /**
     * 更新时间
     */
    @ApiModelProperty(name = "更新时间")
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新者
     */
    @ApiModelProperty(name = "更新者")
    @Column(name = "update_uid")
    private Integer updateUid;




}
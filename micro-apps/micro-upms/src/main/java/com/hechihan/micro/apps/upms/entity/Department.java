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
@Table(name = "department")
public class Department implements Serializable{
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(name = "主键", allowEmptyValue = true)
    private Integer id;

    /**
     * 部门名称
     */
    @ApiModelProperty(name = "部门名称")
    @Column(name = "name",nullable = false)
    private String name;

    /**
     * 上级部门
     */
    @ApiModelProperty(name = "上级部门", allowEmptyValue = true)
    @Column(name = "parent_id",nullable = true)
    private Integer parentId = null;

    /**
     * 所属公司
     */
    @ApiModelProperty(name = "所属公司")
    @Column(name = "company_id", nullable = false)
    private Integer companyId;

    /**
     * 部门经理
     */
    @ApiModelProperty(name = "部门经理", allowEmptyValue = true)
    @Column(name = "manager_id", nullable = false)
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


}
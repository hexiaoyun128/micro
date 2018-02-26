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
@Table(name = "company")
public class Company implements Serializable {
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(name = "主键", allowEmptyValue = true)
    private Integer id;

    /**
     * 公司名称
     */
    @ApiModelProperty(name = "公司名称" ,allowEmptyValue = false)
    @Column(name = "name",nullable = false, unique = true)
    private String name;

    /**
     * 母公司
     */
    @ApiModelProperty(name = "母公司",allowEmptyValue = true)
    @Column(name = "parent_id", nullable = true)
    private Integer parent;

    /**
     * 省份
     */
    @ApiModelProperty(name = "省份",allowEmptyValue = true)
    @Column(name = "province",nullable = true)
    private String province;

    /**
     * 城市
     */
    @ApiModelProperty(name = "城市",allowEmptyValue = true)
    @Column(name = "city",nullable = true)
    private String city;

    /**
     * 区县
     */
    @ApiModelProperty(name = "区县",allowEmptyValue = true)
    @Column(name = "district",nullable = true)
    private String district;

    /**
     * 街道
     */
    @ApiModelProperty(name = "街道",allowEmptyValue = true)
    @Column(name = "street",nullable = true)
    private String street;

    /**
     * 创建时间
     */
    @ApiModelProperty(name = "创建时间",allowEmptyValue = true)
    @Column(name = "create_time",updatable = false)
    private Date createTime;

    /**
     * 创建者
     */
    @ApiModelProperty(name = "创建者",allowEmptyValue = true)
    @Column(name = "create_uid",updatable = false)
    private Integer createUid;

    /**
     * 更新时间
     */
    @ApiModelProperty(name = "更新时间",allowEmptyValue = true)
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新者
     */
    @ApiModelProperty(name = "更新者",allowEmptyValue = true)
    @Column(name = "update_uid")
    private Integer updateUid;

}
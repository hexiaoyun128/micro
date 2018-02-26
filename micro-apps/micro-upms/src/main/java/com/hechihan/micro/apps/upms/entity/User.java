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
@Table(name = "user")
public class User implements Serializable {
    /**
     * 主键
     */
    @Id
    @ApiModelProperty(name = "主键")
    private Integer id;

    /**
     * 用户名
     */
    @ApiModelProperty(name = "用户名")
    @Column(name = "username",nullable = false)
    private String username;

    /**
     * 别名
     */
    @ApiModelProperty(name = "别名")
    @Column(name = "alias")
    private String alias;

    /**
     * 邮箱
     */
    @ApiModelProperty(name = "邮箱")
    @Column(name = "email",nullable = false)
    private String email;

    /**
     * 密码
     */
    @ApiModelProperty(name="密码")
    @Column(name = "password")
    private String password;

    /**
     * 有效
     */
    @ApiModelProperty(name = "有效")
    @Column(name = "active")
    private Boolean active = true;

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
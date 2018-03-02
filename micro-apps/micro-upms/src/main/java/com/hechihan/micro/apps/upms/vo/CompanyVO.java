package com.hechihan.micro.apps.upms.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CompanyVO  implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 公司名称
     */
    private String name;

    /**
     * 母公司
     */
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
    private Date createTime;

    /**
     * 创建者
     */
    private Integer createUid;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新者
     */
    private Integer updateUid;


}
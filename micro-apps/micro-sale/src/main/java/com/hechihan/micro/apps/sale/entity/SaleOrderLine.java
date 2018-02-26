/**
 * @author: cloudy  Date: 2018/1/28 Time: 10:20
 * @email: 272685110@qq.com
 * @description: 销售订单明细
 * @project: micro
 */
package com.hechihan.micro.apps.sale.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "sale_order_line")
@Data
@Entity
public class SaleOrderLine {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 订单号
     */
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 产品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 产品编码
     */
    @Column(name = "product_code")
    private String productCode;

    /**
     * 产品ID
     */
    @Column(name = "product_id")
    private Integer productId;

    /**
     * 数量
     */
    private Integer count;

    /**
     * 所属公司名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 所属公司ID
     */
    @Column(name = "company_id")
    private Integer companyId;

    /**
     * 发货仓库
     */
    @Column(name = "warehouse_name")
    private String warehouseName;

    /**
     * 订单状态 -1:异常,0:草稿 1:确认 2:支付 3:分拣 4:发货 5：收货
     */
    private Integer state;

    /**
     * 发货仓库ID
     */
    @Column(name = "warehouse_id")
    private Integer warehouseId;

    /**
     * 金额合计
     */
    @Column(name = "price_total")
    private BigDecimal priceTotal;

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
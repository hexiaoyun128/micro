/**
 * @author: cloudy  Date: 2018/1/28 Time: 10:20
 * @email: 272685110@qq.com
 * @description: 销售订单
 * @project: micro
 */
package com.hechihan.micro.apps.sale.entity;

import com.hechihan.micro.apps.sale.statemachine.States;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "sale_order")
@Data
@Entity
public class SaleOrder {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * 订单号
     */
    private String name;

    /**
     * 客户名称
     */
    @NotEmpty(message = "{sale.order.customer_name.blank.error}")
    @Column(name = "customer_name")
    private String customerName;

    /**
     * 客户ID
     */
    @NotBlank
    @Column(name = "customer_id")
    private Integer customerId;

    /**
     * 所属公司名称
     */
    @Column(name = "company_name")
    private String companyName;

    /**
     * 所属公司ID
     */
    @NotBlank
    @Column(name = "company_id")
    private Integer companyId;

    /**
     * 发货仓库
     */
    @Column(name = "warehouse_name")
    private String warehouseName;

    /**
     * 发货仓库ID
     */
    @NotBlank
    @Column(name = "warehouse_id")
    private Integer warehouseId;

    /**
     * 送货地址
     */
    @Column(name = "shipping_address")
    private String shippingAddress;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "state")
    private States state;

    /**
     * 订单金额
     */
    @Column(name = "amount_total")
    private BigDecimal amountTotal;

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
     * 订单备注
     */
    private String remarks;

}
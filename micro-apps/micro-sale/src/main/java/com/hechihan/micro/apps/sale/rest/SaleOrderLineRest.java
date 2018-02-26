/**
 * @author: cloudy  Date: 2018/2/3 Time: 9:59
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.apps.sale.rest;

import com.hechihan.micro.apps.sale.biz.SaleOrderLineBiz;
import com.hechihan.micro.apps.sale.entity.SaleOrderLine;
import com.hechihan.micro.common.rest.BaseController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orderline")
@Api(value = "/orderline", description = "订单明细相关接口")
public class SaleOrderLineRest extends BaseController<SaleOrderLineBiz, SaleOrderLine> {
}

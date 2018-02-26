/**
 * @author: cloudy  Date: 2018/2/3 Time: 9:59
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.apps.sale.rest;

import com.hechihan.micro.apps.sale.entity.SaleOrder;
import com.hechihan.micro.common.rest.BaseController;
import com.hechihan.micro.common.vo.ObjectRestResponse;
import com.hechihan.micro.apps.sale.biz.SaleOrderBiz;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("order")
@Api(value = "/order", description = "订单相关接口")
@Slf4j
public class SaleOrderRest extends BaseController<SaleOrderBiz, SaleOrder> {

    @RequestMapping(value = "/event/{id}",method = RequestMethod.POST)
    @ApiOperation(value="订单事件")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "订单ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "event", value = "事件类型", required = true, dataType = "String",allowableValues = "cancel,confirm")
    })
    public ObjectRestResponse<SaleOrder> orderEvent(@PathVariable("id") int id, @RequestParam("event") String event){
        System.out.println("++++++++++++++++++++++"+baseBiz.orderEvent(id,event));
        ObjectRestResponse response = new ObjectRestResponse<SaleOrder>().rel(true).data(baseBiz.selectById(id));
        return response;
    }

}

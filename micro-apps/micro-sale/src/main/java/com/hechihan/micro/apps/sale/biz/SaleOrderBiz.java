/**
 * @author: cloudy  Date: 2018/2/3 Time: 9:57
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.apps.sale.biz;

import com.hechihan.micro.apps.sale.entity.SaleOrder;
import com.hechihan.micro.apps.sale.mapper.SaleOrderMapper;
import com.hechihan.micro.apps.sale.statemachine.Events;
import com.hechihan.micro.apps.sale.statemachine.States;
import com.hechihan.micro.common.biz.BaseBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor=Exception.class)
public class SaleOrderBiz extends BaseBiz<SaleOrderMapper,SaleOrder> {

    @Autowired
    private StateMachine<States, Events> stateMachine;
    /**
     * 订单事件处理
     * @param id 订单ID
     * @param event 订单事件
     */
    public boolean orderEvent(int id, String event) {
        Boolean result = false;
        stateMachine.start();
        switch (event){
            case "confirm":
                result =stateMachine.sendEvent(Events.CONFIRM);
                break;
            case "cancel":
                result =stateMachine.sendEvent(Events.CANCEL);
                break;

        }
        stateMachine.stop();
        return result;

    }

}

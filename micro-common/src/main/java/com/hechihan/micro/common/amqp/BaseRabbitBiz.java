/**
 * @author: cloudy  Date: 2018/2/6 Time: 17:01
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.common.amqp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;

import javax.annotation.Resource;
import java.util.Date;
import java.util.UUID;

@Slf4j
public abstract class BaseRabbitBiz implements RabbitTemplate.ConfirmCallback {
    @Resource
    public RabbitTemplate rabbitTemplate;

    public void sendMessage(final String serviceMethod, final String appId, final String serviceName, String routingkey, final String queueName, final String correlation, Object messageBody){
        final String uuid = UUID.randomUUID().toString();
        log.info("sendMessage [UUID:{}, this.{},serviceName:{},serviceMethod:{},correlationId: {},messageBody:{}]",uuid,this.getClass(),serviceName,serviceMethod,correlation,messageBody.toString());
        rabbitTemplate.setConfirmCallback(this);
        rabbitTemplate.setCorrelationKey(queueName);
        rabbitTemplate.convertAndSend(routingkey, messageBody, new MessagePostProcessor() {
            @Override
            public Message postProcessMessage(Message message) throws AmqpException {
                message.getMessageProperties().setAppId(appId);
                message.getMessageProperties().setTimestamp(new Date());
                message.getMessageProperties().setMessageId(uuid);
                message.getMessageProperties().setCorrelationIdString(correlation);
                message.getMessageProperties().setHeader("ServiceMethod",serviceMethod);
                message.getMessageProperties().setHeader("ServiceName",serviceName);
                return message;
            }
        },new CorrelationData(correlation));
    }
    @Override
    public void confirm(CorrelationData correlationData, boolean b, String s) {

    }
}

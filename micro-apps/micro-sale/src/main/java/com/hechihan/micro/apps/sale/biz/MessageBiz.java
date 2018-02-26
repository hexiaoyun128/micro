package com.hechihan.micro.apps.sale.biz;

import com.hechihan.micro.common.amqp.MicroMessage;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageBiz {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void sendMessage(MicroMessage message) {

		this.rabbitTemplate.convertAndSend("message", message);
	}

}
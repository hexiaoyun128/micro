package com.hechihan.micro.message.listener;

import com.aliyuncs.exceptions.ClientException;
import com.hechihan.micro.common.amqp.MicroEmail;
import com.hechihan.micro.common.amqp.MicroMessage;
import com.hechihan.micro.message.biz.EmailBiz;
import com.hechihan.micro.message.biz.SmsBiz;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 翟永超
 * @create 2016/9/25.
 * @blog http://blog.didispace.com
 */
@Component
public class Receiver {

    @Autowired
    private EmailBiz emailBiz;
    @Autowired
    private SmsBiz smsBiz;

    @RabbitHandler
    @RabbitListener(queues = "message")
    public void sendEmail(MicroMessage message) throws ClientException {
        if (message.isEmailSend()){
            emailBiz.simpleMail(message.getEmail());
        }else {
            try {
                smsBiz.sendSms(message.getSms());
            }catch (ClientException e){
                System.out.println(e.getMessage());
            }

        }

    }


}

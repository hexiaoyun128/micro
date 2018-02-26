/**
 * @author: cloudy  Date: 2018/2/6 Time: 18:05
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.message.biz;

import com.hechihan.micro.common.amqp.MicroEmail;
import com.hechihan.micro.common.amqp.MicroMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailBiz {
    @Autowired
    private JavaMailSender mailSender;


    /**
     * 发送简单邮件
     * @return
     */
    public String simpleMail(MicroEmail microEmail){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(microEmail.getMailForm());
        mailMessage.setTo(microEmail.getMailTo());
        mailMessage.setSubject(microEmail.getSubject());
        mailMessage.setText(microEmail.getText());
        mailSender.send(mailMessage);
        return null;
    }

    /**
     * 发送带附件邮件
     * @return
     */
    public String attachmentsMail(MicroEmail microEmail){
        return null;
    }
    /**
     * 发送html嵌入邮件
     * @return
     */
    public String inlineMail(MicroEmail microEmail){
        return null;
    }

}

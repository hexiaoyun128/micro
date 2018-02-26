/**
 * @author: cloudy  Date: 2018/2/22 Time: 15:09
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.admin.monitor.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@Data
public class MessagesReceiver {
    /**
     * 短信接收列表
     */
    @Value("${note.mobiles}")
    private String mobiles;
    /**
     * 邮件接收列表
     */
    @Value("${note.emails}")
    private String emails;
}

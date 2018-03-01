package com.hechihan.micro.apps.message.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 翟永超
 * @create 2016/9/25.
 * @blog http://blog.didispace.com
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue messageQueue() {
        return new Queue("message");
    }

}

/**
 * @author: cloudy  Date: 2018/2/6 Time: 9:08
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.hechihan.micro.message")
@EnableTransactionManagement
@EnableFeignClients
public class MessageBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(MessageBootstrap.class,args);
    }
}

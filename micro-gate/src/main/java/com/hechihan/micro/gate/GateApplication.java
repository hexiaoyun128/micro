/**
 * @author: cloudy  Date: 2018/2/22 Time: 13:55
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@ComponentScan("com.hechihan.micro.gate")
@EnableFeignClients
public class GateApplication {
    public static void main(String[] args) {
        SpringApplication.run(GateApplication.class,args);
    }
}

/**
 * @author: cloudy  Date: 2018/2/22 Time: 13:54
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryApplication.class,args);
    }
}

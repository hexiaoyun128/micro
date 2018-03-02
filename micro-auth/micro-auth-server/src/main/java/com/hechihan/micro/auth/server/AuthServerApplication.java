/**
 * @author: cloudy  Date: 2018/3/2 Time: 11:45
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.auth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hechihan.micro.auth.server")
public class AuthServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthServerApplication.class,args);
    }
}

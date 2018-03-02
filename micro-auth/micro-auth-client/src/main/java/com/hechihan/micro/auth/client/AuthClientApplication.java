/**
 * @author: cloudy  Date: 2018/3/1 Time: 16:43
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.auth.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hechihan.micro.auth.client")
public class AuthClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthClientApplication.class,args);
    }
}
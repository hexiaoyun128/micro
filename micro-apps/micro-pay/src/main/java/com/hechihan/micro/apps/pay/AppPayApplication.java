/**
 * @author: cloudy  Date: 2018/2/27 Time: 15:36
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.apps.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.hechihan.micro.apps.pay.mapper")
@ComponentScan(basePackages={"com.hechihan.micro.apps.pay","com.hechihan.micro.common.bean"})
@EnableTransactionManagement
@EnableFeignClients
public class AppPayApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppPayApplication.class,args);
    }

}

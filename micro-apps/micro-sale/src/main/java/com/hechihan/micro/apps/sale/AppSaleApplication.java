/**
 * @author: cloudy  Date: 2018/1/28 Time: 10:20
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.apps.sale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.hechihan.micro.apps.sale.mapper")
@ComponentScan(basePackages={"com.hechihan.micro.apps.sale","com.hechihan.micro.common.bean"})
@EnableTransactionManagement
@EnableFeignClients
public class AppSaleApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppSaleApplication.class,args);
    }
}


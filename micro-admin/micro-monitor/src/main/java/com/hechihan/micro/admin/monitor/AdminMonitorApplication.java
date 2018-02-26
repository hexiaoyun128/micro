/**
 * @author: cloudy  Date: 2018/2/22 Time: 10:43
 * @email: 272685110@qq.com
 * @description: 监控模块
 * @project: micro
 */

package com.hechihan.micro.admin.monitor;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
@EnableTurbine
public class AdminMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminMonitorApplication.class,args);
    }
}

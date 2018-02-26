/**
 * @author: cloudy  Date: 2018/2/22 Time: 13:38
 * @email: 272685110@qq.com
 * @description: 链路追踪
 * @project: micro
 */

package com.hechihan.micro.admin.zipkin.elk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
public class AdminZipkinElkApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminZipkinElkApplication.class,args);
    }
}

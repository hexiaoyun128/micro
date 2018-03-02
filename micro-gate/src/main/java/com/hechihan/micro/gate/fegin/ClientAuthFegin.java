/**
 * @author: cloudy  Date: 2018/3/1 Time: 17:25
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.gate.fegin;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("micro-auth-client")
public interface ClientAuthFegin {
}

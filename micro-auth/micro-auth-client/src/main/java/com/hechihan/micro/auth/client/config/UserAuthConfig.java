/**
 * @author: cloudy  Date: 2018/3/1 Time: 11:47
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.auth.client.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import javax.servlet.http.HttpServletRequest;
@Data
public class UserAuthConfig {
    @Value("${auth.user.token-header}")
    private String tokenHeader;
    private byte[] pubKeyByte;

    public String getToken(HttpServletRequest request) {
        return request.getHeader(this.getTokenHeader());
    }
}

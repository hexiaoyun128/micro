/**
 * @author: cloudy  Date: 2018/3/1 Time: 16:57
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.auth.client.rest;

import com.hechihan.micro.common.vo.ObjectRestResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jwt")
public class AuthClientController {
    @Value("${jwt.token-header}")
    private String tokenHeader;

    @PostMapping(value = "token")
    public ObjectRestResponse<String> createAuthToken(String username, String password){
        return new ObjectRestResponse<String>().data("wer");
    }
}

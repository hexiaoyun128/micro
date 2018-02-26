/**
 * @author: cloudy  Date: 2018/1/30 Time: 16:07
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.common.util.jwt;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class JwtInfo implements Serializable{
    private String username;
    private String userId;
    private String name;


}

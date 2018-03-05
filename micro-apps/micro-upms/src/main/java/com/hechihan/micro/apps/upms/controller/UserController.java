/**
 * @author: cloudy  Date: 2018/3/5 Time: 15:15
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.apps.upms.controller;

import com.alibaba.fastjson.JSON;
import com.hechihan.micro.apps.upms.entity.User;
import com.hechihan.micro.apps.upms.service.UserService;
import com.hechihan.micro.common.vo.ObjectRestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
@Api(value = "/user", description = "用户相关接口")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    @ResponseBody
    @ApiOperation(value="根据id获得用户")
    @ApiParam(value = "id",name = "用户id", required = true)
    public ObjectRestResponse<User> getUserById(@PathVariable int id){
        User user = userService.selectUserById(id);
        return  new ObjectRestResponse<User>().rel(true).data(JSON.toJSON(user));
    };

    @PostMapping(value = "")
    @ResponseBody
    @ApiOperation(value="创建用户")
    @ApiParam(value = "user",name = "用户", type = "User", required = true)
    public ObjectRestResponse<User> getUserById(@RequestBody User user){
        userService.createUser(user);
        User createdUser = userService.selectUserById(user.getId());
        return  new ObjectRestResponse<User>().rel(true).data(JSON.toJSON(createdUser));
    };
}

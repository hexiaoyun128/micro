/**
 * @author: cloudy  Date: 2018/2/3 Time: 9:59
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.apps.upms.rest;

import com.hechihan.micro.apps.upms.biz.UserBiz;
import com.hechihan.micro.apps.upms.entity.User;
import com.hechihan.micro.apps.upms.vo.UserVO;
import com.hechihan.micro.common.rest.BaseController;
import com.hechihan.micro.common.vo.ObjectRestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("user")
@Api(value = "/user", description = "用户相关接口")
@Slf4j
public class UserRest extends BaseController<UserBiz, User> {
    @Override
    @RequestMapping(value = "",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value="创建")
    public ObjectRestResponse<User> add( @RequestBody User user){
        baseBiz.insertSelective(user);
        return new ObjectRestResponse<User>().rel(true).data(user);
    }



}

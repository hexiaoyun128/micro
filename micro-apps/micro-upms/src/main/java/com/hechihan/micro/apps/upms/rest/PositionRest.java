/**
 * @author: cloudy  Date: 2018/2/3 Time: 9:59
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.apps.upms.rest;

import com.hechihan.micro.apps.upms.biz.PositionBiz;
import com.hechihan.micro.apps.upms.entity.Position;
import com.hechihan.micro.common.rest.BaseController;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("position")
@Api(value = "/position", description = "职位相关接口")
@Slf4j
public class PositionRest extends BaseController<PositionBiz, Position> {


}

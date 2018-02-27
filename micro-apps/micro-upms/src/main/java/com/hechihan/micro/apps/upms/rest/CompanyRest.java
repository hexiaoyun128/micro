/**
 * @author: cloudy  Date: 2018/2/3 Time: 9:59
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.apps.upms.rest;

import com.hechihan.micro.apps.upms.biz.CompanyBiz;
import com.hechihan.micro.apps.upms.entity.Company;
import com.hechihan.micro.common.rest.BaseController;
import com.hechihan.micro.common.vo.ObjectRestResponse;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("company")
@Api(value = "/company", description = "公司相关接口")
@Slf4j
@RefreshScope
public class CompanyRest extends BaseController<CompanyBiz, Company> {

}

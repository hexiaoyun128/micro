/**
 * @author: cloudy  Date: 2018/3/5 Time: 15:15
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.apps.upms.controller;

import com.hechihan.micro.apps.upms.entity.Company;
import com.hechihan.micro.apps.upms.entity.User;
import com.hechihan.micro.apps.upms.service.CompanyService;
import com.hechihan.micro.apps.upms.service.UserService;
import com.hechihan.micro.common.vo.ObjectRestResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("company")
@Api(value = "/company", description = "公司相关接口")
@Slf4j
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping(value = "/{id}")
    @ResponseBody
    @ApiOperation(value="根据id获得公司")
    @ApiParam(value = "id",name = "公司id", required = true)
    public ObjectRestResponse<User> getById(@PathVariable int id){
        Company company = companyService.selectCompanyById(id);
        return  new ObjectRestResponse<User>().rel(true).data(company);

    };
}

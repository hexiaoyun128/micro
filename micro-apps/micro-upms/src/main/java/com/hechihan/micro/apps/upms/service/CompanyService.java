/**
 * @author: cloudy  Date: 2018/3/5 Time: 15:28
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.apps.upms.service;

import com.hechihan.micro.apps.upms.entity.Company;

public interface CompanyService {
    Company selectCompanyById(Integer id);
}

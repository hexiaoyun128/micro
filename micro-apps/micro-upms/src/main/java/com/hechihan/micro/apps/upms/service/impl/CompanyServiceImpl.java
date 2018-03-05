/**
 * @author: cloudy  Date: 2018/3/5 Time: 15:28
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.apps.upms.service.impl;

import com.hechihan.micro.apps.upms.entity.Company;
import com.hechihan.micro.apps.upms.mapper.CompanyMapper;
import com.hechihan.micro.apps.upms.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;
    @Override
    public Company selectCompanyById(Integer id) {
        return companyMapper.selectByPrimaryKey(id);
    }
}

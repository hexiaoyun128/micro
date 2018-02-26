/**
 * @author: cloudy  Date: 2018/2/3 Time: 9:57
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.apps.upms.biz;

import com.hechihan.micro.apps.upms.entity.Company;
import com.hechihan.micro.apps.upms.mapper.CompanyMapper;
import com.hechihan.micro.common.biz.BaseBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor=Exception.class)
public class CompanyBiz extends BaseBiz<CompanyMapper,Company> {

}

/**
 * @author: cloudy  Date: 2018/2/3 Time: 10:21
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.apps.sale.biz;

import com.hechihan.micro.apps.sale.entity.SaleOrderLine;
import com.hechihan.micro.common.biz.BaseBiz;
import com.hechihan.micro.apps.sale.mapper.SaleOrderLineMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor=Exception.class)
public class SaleOrderLineBiz extends BaseBiz<SaleOrderLineMapper,SaleOrderLine> {
}

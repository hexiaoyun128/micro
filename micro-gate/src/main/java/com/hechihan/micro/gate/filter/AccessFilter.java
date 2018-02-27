/**
 * @author: cloudy  Date: 2018/2/27 Time: 12:47
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.gate.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.ZuulFilterResult;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.core.Ordered;

public class AccessFilter extends ZuulFilter {



    @Override
    public ZuulFilterResult runFilter() {
        return super.runFilter();
    }



    @Override
    public String filterType() {
        return  FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        return null;
    }
}

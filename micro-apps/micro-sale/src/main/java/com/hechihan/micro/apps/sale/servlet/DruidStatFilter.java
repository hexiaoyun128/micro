/**
 * @author: cloudy  Date: 2018/2/27 Time: 10:01
 * @email: 272685110@qq.com
 * @description:  配置druid监控统计功能 配置Filter
 * @project: micro
 */

package com.hechihan.micro.apps.sale.servlet;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(
        filterName = "druidWebStatFilter",
        urlPatterns = "/*",
        initParams = {
                @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")	// 忽略资源
        }
)
public class DruidStatFilter extends WebStatFilter {
}

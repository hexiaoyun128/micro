/**
 * @author: cloudy  Date: 2018/2/27 Time: 12:47
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.gate.filter;

import com.hechihan.micro.gate.fegin.ClientAuthFegin;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.ZuulFilterResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.core.Ordered;

public class AccessFilter extends ZuulFilter {



    @Value("${zuul.prefix}")
    private String zuulPrefix;
    @Value("${jwt.ignore-url}")
    private String jwtIgnoreUrl;
    @Value("${jwt.token-header}")
    private String jwtTokenHeader;

    @Value("${client.id}")
    private String clientId;
    @Value("${client.secret}")
    private String clientSecret;
    @Value("${client.token-header}")
    private String clientTokenHeader;

    @Autowired
    private ClientAuthFegin clientAuthFegin;

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
    private boolean isIgnorePath(String path) {
        for (String url : jwtIgnoreUrl.split(",")) {
            if (path.substring(zuulPrefix.length()).startsWith(url)) {
                return true;
            }
        }
        return false;
    }
}

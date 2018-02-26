package com.hechihan.micro.cachecloud.client.jedis.stat;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hechihan.micro.cachecloud.client.basic.util.ConstUtils;
import com.hechihan.micro.cachecloud.client.basic.util.HttpUtils;
import com.hechihan.micro.cachecloud.client.basic.util.JsonUtil;
import com.hechihan.micro.jedis.stat.constant.ClientReportConstant;
import com.hechihan.micro.jedis.stat.data.UsefulDataCollector;
import com.hechihan.micro.jedis.stat.enums.ClientExceptionType;
import com.hechihan.micro.jedis.stat.model.ClientReportBean;

/**
 * 客户端常量和上报工具
 *
 * @author leifu
 * @Date 2015年1月16日
 * @Time 下午2:50:59
 */
public class ClientReportDataCenter {

    private static Logger logger = LoggerFactory.getLogger(ClientReportDataCenter.class);

    /**
     * 上报
     *
     * @param url
     * @param ccReportBean
     */
    public static void reportData(String url, ClientReportBean ccReportBean) {

        if (ccReportBean == null) {
            logger.error("ccReportBean is null!");
        }

        Map<String, String> parameters = new HashMap<String, String>();
        parameters.put(ClientReportConstant.JSON_PARAM, JsonUtil.toJson(ccReportBean));
        parameters.put(ClientReportConstant.CLIENT_VERSION, ConstUtils.CLIENT_VERSION);

        try {
            HttpUtils.doPost(url, parameters);
        } catch (Exception e) {
            logger.error("cachecloud reportData exception: " + e.getMessage());
            UsefulDataCollector.collectException(e, "", System.currentTimeMillis(), ClientExceptionType.CLIENT_EXCEPTION_TYPE);
        }
    }
}

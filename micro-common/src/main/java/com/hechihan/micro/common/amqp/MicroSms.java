/**
 * @author: cloudy  Date: 2018/2/8 Time: 11:59
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.common.amqp;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class MicroSms implements Serializable {
    /**
     * 多接收者，通知信息,默认单条
     */
    private boolean multiReceivers = false;
    /**
     * 回执
     */
    private boolean feedBack = false;
    /**
     * 接收人列表
     */
    private List<String> receivers=new ArrayList<String>();

    /**
     * 信息内容
     */
    private String smsText;
    /**
     * 连接超时时间
     * 毫秒
     */
    private Integer connectTimeOut;
    /**
     * 读超时时间
     * 毫秒
     */
    private Integer readTimeOut;
    /**
     * 短信签名
     */
    private String signName;

    /**
     * 短信模版
     */
    private String templateCode;
    /**
     * 短信模版参数 JSON字符串
     */
    private String templateParam;
    /**
     * 可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
     */
    private String outId;
    /**
     * 可选-流水号
     */
    private String bizId;
}
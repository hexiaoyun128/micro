/**
 * @author: cloudy  Date: 2018/2/8 Time: 10:57
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.message.biz;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.QuerySendDetailsResponse;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.hechihan.micro.common.amqp.MicroSms;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class SmsBiz {

    /**
     * 产品名称:云通信短信API产品,开发者无需替换
     */
    @Value("${aliyun.product:Dysmsapi}")
    private  String product;

    /**
     * 产品域名,开发者无需替换
     */
    @Value("${aliyun.domain:dysmsapi.aliyuncs.com}")
    private  String domain;

    // TODO 此处需要替换成开发者自己的AK(在阿里云访问控制台寻找)
    /**
     *  aliyun accessKey
     */
    @Value("${aliyun.accessKeySecret}")
    private  String accessKeyId;
    /**
     *  aliyun accessKeySecret
     */
    @Value("${aliyun.accessKeySecret}")
    private  String accessKeySecret;

    @Value("${aliyun.regionId}")
    private String regionId;

    @Value("${aliyun.endpointName}")
    private  String endpointName;

    public  SendSmsResponse sendSms(MicroSms sms) throws ClientException {



        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile(regionId, accessKeyId, accessKeySecret);
        DefaultProfile.addEndpoint(endpointName, regionId, product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象-具体描述见控制台-文档部分内容
        SendSmsRequest request = new SendSmsRequest();
        //必填:待发送手机号
        request.setPhoneNumbers(sms.getReceivers().get(0));
        //必填:短信签名-可在短信控制台中找到
        request.setSignName(sms.getSignName());
        //必填:短信模板-可在短信控制台中找到
        request.setTemplateCode(sms.getTemplateCode());
        //可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
        request.setTemplateParam(sms.getTemplateParam());

        // 可选为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
        request.setOutId(sms.getOutId());

        //hint 此处可能会抛出异常，注意catch
        SendSmsResponse sendSmsResponse = acsClient.getAcsResponse(request);

        return sendSmsResponse;
    }


    public  QuerySendDetailsResponse querySendDetails(MicroSms sms) throws ClientException {



        //初始化acsClient,暂不支持region化
        IClientProfile profile = DefaultProfile.getProfile(regionId, accessKeyId, accessKeySecret);
        DefaultProfile.addEndpoint(endpointName, regionId, product, domain);
        IAcsClient acsClient = new DefaultAcsClient(profile);

        //组装请求对象
        QuerySendDetailsRequest request = new QuerySendDetailsRequest();
        //必填-号码
        request.setPhoneNumber(sms.getReceivers().get(0));
        //可选-流水号
        request.setBizId(sms.getBizId());
        //必填-发送日期 支持30天内记录查询，格式yyyyMMdd
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMdd");
        request.setSendDate(ft.format(new Date()));
        //必填-页大小
        request.setPageSize(10L);
        //必填-当前页码从1开始计数
        request.setCurrentPage(1L);

        //hint 此处可能会抛出异常，注意catch
        QuerySendDetailsResponse querySendDetailsResponse = acsClient.getAcsResponse(request);

        return querySendDetailsResponse;
    }
}

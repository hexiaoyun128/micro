/**
 * @author: cloudy  Date: 2018/2/8 Time: 11:51
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.common.amqp;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class MicroMessage implements Serializable {
    /**
     * 是sms
     */
    private boolean emailSend;
    /**
     * sms内容
     */
    private MicroSms sms;
    /**
     * email 内容
     */
    private MicroEmail email;



}

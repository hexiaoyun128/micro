/**
 * @author: cloudy  Date: 2018/2/8 Time: 11:58
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
public class MicroEmail implements Serializable {
    /**
     * 邮件头
     */
    private String subject;
    /**
     * 邮件内容
     */
    private String text;
    /**
     * 发件人
     */
    private String mailForm;
    /**
     * 收件人
     */
    private String mailTo;

}

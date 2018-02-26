/**
 * @author: cloudy  Date: 2018/1/31 Time: 16:00
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.common.exception.auth;

import com.hechihan.micro.common.constants.CommonConstants;
import com.hechihan.micro.common.exception.BaseException;

public class ClientInvalidException extends BaseException {
    public ClientInvalidException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }


}

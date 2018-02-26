/**
 * @author: cloudy  Date: 2018/1/30 Time: 17:28
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.common.exception.auth;

import com.hechihan.micro.common.constants.CommonConstants;
import com.hechihan.micro.common.exception.BaseException;

public class UserInvalidException extends BaseException {
    public UserInvalidException(String message){
        super(message, CommonConstants.EX_USER_INVALID_CODE);
    }
}

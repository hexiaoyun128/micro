/**
 * @author: cloudy  Date: 2018/1/28 Time: 14:40
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.common.exception.auth;

import com.hechihan.micro.common.constants.CommonConstants;
import com.hechihan.micro.common.exception.BaseException;

public class TokenErrorException extends BaseException {
    public TokenErrorException(String message, int status) {
        super(message, CommonConstants.EX_TOKEN_ERROR_CODE);
    }
}

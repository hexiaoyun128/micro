/**
 * @author: cloudy  Date: 2018/2/2 Time: 14:39
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.common.exception.auth;

import com.hechihan.micro.common.constants.CommonConstants;
import com.hechihan.micro.common.exception.BaseException;

public class ClientForbiddenExpection extends BaseException {
    public ClientForbiddenExpection(String message) {
        super(message, CommonConstants.EX_CLIENT_FORBIDDEN_CODE);
    }
}

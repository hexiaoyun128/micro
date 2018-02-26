/**
 * @author: cloudy  Date: 2018/1/28 Time: 14:39
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.common.exception;

import com.hechihan.micro.common.constants.CommonConstants;

public class BaseException extends RuntimeException {
    private int status= CommonConstants.OK;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public BaseException() {
    }

    public BaseException(String message,int status) {
        super(message);
        this.status = status;
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

/**
 * @author: cloudy  Date: 2018/1/28 Time: 14:44
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.common.handler;

import com.hechihan.micro.common.exception.BaseException;
import com.hechihan.micro.common.vo.BaseResponse;
import com.hechihan.micro.common.constants.CommonConstants;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.http.HttpServletResponse;

@ControllerAdvice("com.hechihan.micro")
@ResponseBody
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @ExceptionHandler(BaseException.class)
    public BaseResponse baseExceptionHandler(HttpServletResponse response,BaseException ex){
        return new BaseResponse(ex.getStatus(),ex.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public BaseResponse otherExceptionHandler(HttpServletResponse response, Exception ex) {
        logger.error(ex.getMessage(),ex);
        return new BaseResponse(CommonConstants.EX_OTHER_CODE, ex.getMessage());
    }
}

/**
 * @author: cloudy  Date: 2018/1/28 Time: 13:49
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.common.vo;

import com.hechihan.micro.common.constants.CommonConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponse {
    private int status = CommonConstants.OK;
    private String message;

}

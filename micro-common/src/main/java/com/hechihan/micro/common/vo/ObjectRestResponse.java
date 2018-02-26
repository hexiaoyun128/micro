/**
 * @author: cloudy  Date: 2018/1/28 Time: 13:51
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.common.vo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor()
public class ObjectRestResponse<T> extends BaseResponse {
    T data;
    boolean rel;


    public ObjectRestResponse rel(boolean rel) {
        this.setRel(rel);
        return this;
    }


    public ObjectRestResponse data(T data) {
        this.setData(data);
        return this;
    }


}


/**
 * @author: cloudy  Date: 2018/2/7 Time: 10:32
 * @email: 272685110@qq.com
 * @description: 给entity自动赋值：创建修改的时间和创建者
 * @project: micro
 */

package com.hechihan.micro.common.util;

public class EntityUtils {
    public static <T> void setCreateAndUpdateInfo(T entity){
        setCreateInfo(entity);
        setUpdateInfo(entity);
    }

    private static <T> void setCreateInfo(T entity) {
    }

    private static <T> void setUpdateInfo(T entity) {
        
    }
}

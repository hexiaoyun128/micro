/**
 * @author: cloudy  Date: 2018/3/5 Time: 15:08
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.apps.upms.service;

import com.hechihan.micro.apps.upms.entity.User;

public interface UserService {
    /**
     * 根据id获取用户
     * @param id
     * @return
     */
    User selectUserById(Integer id);

    /**
     * 创建用户
     * @param user
     * @return
     */
    User createUser(User user);
}

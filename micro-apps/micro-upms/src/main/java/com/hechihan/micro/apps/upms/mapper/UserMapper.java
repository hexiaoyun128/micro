package com.hechihan.micro.apps.upms.mapper;

import com.hechihan.micro.apps.upms.entity.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper  extends Mapper<User> {
    /**
     * 根据用户id获得用户信息
     * @param id
     * @return
     */
    User selectUserById(Integer id);


}
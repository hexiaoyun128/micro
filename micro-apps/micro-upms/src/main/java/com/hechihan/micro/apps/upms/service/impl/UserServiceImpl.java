/**
 * @author: cloudy  Date: 2018/3/5 Time: 15:12
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.apps.upms.service.impl;

import com.hechihan.micro.apps.upms.entity.User;
import com.hechihan.micro.apps.upms.mapper.UserMapper;
import com.hechihan.micro.apps.upms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl  implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectUserById(Integer id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public User createUser(User user) {
        userMapper.insertSelective(user);
        return user;
    }
}

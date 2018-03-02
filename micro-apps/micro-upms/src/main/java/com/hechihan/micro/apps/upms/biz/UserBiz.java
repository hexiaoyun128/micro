/**
 * @author: cloudy  Date: 2018/2/3 Time: 9:57
 * @email: 272685110@qq.com
 * @description:
 * @project: micro
 */

package com.hechihan.micro.apps.upms.biz;

import com.hechihan.micro.apps.upms.entity.User;
import com.hechihan.micro.apps.upms.mapper.UserMapper;
import com.hechihan.micro.common.biz.BaseBiz;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor=Exception.class)
public class UserBiz extends BaseBiz<UserMapper,User> {
    @Override
    public void insertSelective(User entity) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        entity.setPassword(bCryptPasswordEncoder.encode(entity.getPassword()));
        super.insertSelective(entity);
    }
}

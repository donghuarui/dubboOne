package org.dhr.one.server.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.dhr.one.api.service.UserService;
import org.dhr.one.model.entity.User;
import org.dhr.one.model.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Service
@Component //注册为spring bean
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByUsername(String username) {
        return userMapper.findUserByUsername(username);
    }
}

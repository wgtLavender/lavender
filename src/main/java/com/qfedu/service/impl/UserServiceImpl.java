package com.qfedu.service.impl;

import com.qfedu.mapper.UserMapper;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: IDEA
 * @author: Mr.Wang
 * @create: 2018-11-18 19:08
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;
    public User login(User user) {
        return mapper.selectUser(user);
    }
}


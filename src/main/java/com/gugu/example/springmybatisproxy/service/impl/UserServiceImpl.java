package com.gugu.example.springmybatisproxy.service.impl;

import com.gugu.example.springmybatisproxy.mapper.UserMapper;
import com.gugu.example.springmybatisproxy.model.User;
import com.gugu.example.springmybatisproxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author gugu
 * @Classname UserServiceimpl
 * @Description TODO
 * @Date 2022/7/17 9:09
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(String userId){
        return userMapper.getUser(userId);
    }

    @Override
    public void create() {
        System.out.println("create user");
    }
}

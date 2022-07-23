package com.gugu.example.springmybatisproxy.service;

import com.gugu.example.springmybatisproxy.model.User;

/**
 * @author gugu
 * @Classname UserService
 * @Description TODO
 * @Date 2022/7/17 9:09
 */
public interface UserService {
    User getUserById(String userId);

    void create();
}

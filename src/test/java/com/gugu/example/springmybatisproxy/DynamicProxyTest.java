package com.gugu.example.springmybatisproxy;

import com.gugu.example.springmybatisproxy.invocation.InvocationInterceptor;
import com.gugu.example.springmybatisproxy.service.UserService;
import com.gugu.example.springmybatisproxy.service.impl.UserServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @author gugu
 * @Classname DynamicProxyTest
 * @Description TODO
 * @Date 2022/7/17 9:21
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        UserService target = new UserServiceImpl();
        InvocationInterceptor invocationInterceptor = new InvocationInterceptor(target) ;
        UserService proxyInstance = (UserService) Proxy.newProxyInstance(UserServiceImpl.class.getClassLoader(), UserServiceImpl.class.getInterfaces(), invocationInterceptor);
        proxyInstance.create();
    }
}

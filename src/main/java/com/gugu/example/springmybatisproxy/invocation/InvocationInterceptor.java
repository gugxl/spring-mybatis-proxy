package com.gugu.example.springmybatisproxy.invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author gugu
 * @Classname InvocationInterceptor
 * @Description TODO
 * @Date 2022/7/17 9:31
 */
public class InvocationInterceptor implements InvocationHandler {
    private Object target;

    public InvocationInterceptor(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before user create");
        method.invoke(target, args);
        System.out.println("after user create");
        return null;
    }
}

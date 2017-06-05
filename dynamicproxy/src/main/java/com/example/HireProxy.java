package com.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HireProxy implements InvocationHandler {
    // 被代理的真实角色
    private Object obj;

    public HireProxy(Object obj) {
        this.obj = obj;
    }

    /**
     * jdk动态代理，被代理的对象必须实现接口
     * @param proxy
     * @param method 被代理对象的接口方法
     * @param args 被代理对象的接口方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置工作");
        System.out.println("-------------------");
        for (Object arg : args) {
            System.out.println(arg);
        }
        System.out.println("-------------------");
        Object invoke = method.invoke(obj, args);
        System.out.println(invoke);
        System.out.println("后置工作");
        return invoke;
    }
}

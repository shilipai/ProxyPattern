package com.example;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * 实现功能：
 * <p>
 * Created by lxs on 2017/6/5 15:51.
 */

public class Customer {
    public static void main(String[] args) {
        /*// 创建被代理的接口实现类的对象
        HireHouseImpl hhi = new HireHouseImpl();
        // 创建代理对象
        // 1、被代理对象的类加载器 2、被代理对象的类的所有接口 3、自定义代理类的对象
        HireHouse hh = (HireHouse) Proxy.newProxyInstance(hhi.getClass().getClassLoader(), hhi.getClass().getInterfaces(), new HireProxy(hhi));
        hh.hire();*/
        // 创建被代理的接口实现类的对象
        ArrayList listImpl = new ArrayList();
        // 创建代理对象
        // 1、被代理对象的类加载器 2、被代理对象的类的所有接口 3、自定义代理类的对象
        List list = (List) Proxy.newProxyInstance(listImpl.getClass().getClassLoader(), listImpl.getClass().getInterfaces(), new HireProxy(listImpl));
        list.add("屎玉");
        list.get(0);
    }
}

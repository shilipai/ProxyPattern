package com.staticproxy;

/**
 * 实现功能：
 * <p>
 * Created by lxs on 2017/6/5 18:19.
 */

public class Customer {
    public static void main(String[] args) {
        // 静态代理
        HireHouse hh = new HireHouseProxy(new HireHouseImpl());
        hh.hire();
        // 不用代理
        HireHouse hh1 = new HireHouseImpl();
        hh1.hire();
    }
}

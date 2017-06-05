package com.staticproxy;

/**
 * 实现功能：
 * <p>
 * Created by lxs on 2017/6/5 18:18.
 */

public class HireHouseProxy implements HireHouse {
    private HireHouse hh;
    public HireHouseProxy(HireHouse hh) {
        this.hh = hh;
    }
    @Override
    public void hire() {
        System.out.println("收中介费");
        hh.hire();
        System.out.println("扣押金");
    }
}

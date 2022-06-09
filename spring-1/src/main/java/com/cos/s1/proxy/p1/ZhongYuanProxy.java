package com.cos.s1.proxy.p1;

/**
 * @author: COS
 * @time: 2022/6/2 15:49
 * @description:
 */
public class ZhongYuanProxy implements FangDong {
    @Override
    public void zuFang() {
        //赋值功能
        System.out.println("贴小广告");
        System.out.println("带人看房");
        FangDong fd = new FangDongImpl();
        fd.zuFang();
    }


    public static void main(String[] args) {

        FangDong fd = new ZhongYuanProxy();
        fd.zuFang();

    }
}

package com.cos.s1.entity;

/**
 * @author: COS
 * @time: 2022/6/2 9:41
 * @description:
 */
public class Dog2 extends Pet{

    String name;

    @Override
    public void play() {
        System.out.println("狗咬人");
    }


}

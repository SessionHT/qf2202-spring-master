package com.cos.s2.services.impl;

import com.cos.s2.entity.User;
import com.cos.s2.services.UserServices;

import java.util.List;

/**
 * @author: COS
 * @time: 2022/6/6 8:58
 * @description:
 * jdk 代理 必须有现实接口的
 * cglib 代理 是要有父类就可以
 * aop 面向切面编程->oop面向对象编程补充扩展
 *
 */
public class UserServicesImpl implements UserServices {
    @Override
    public List<User> getAll() {
//        System.out.println("开启事务");
//        System.out.println("记录日志");
        System.out.println("getAll");
        return null;
    }

    @Override
    public User getUserById(int id) {
//        System.out.println("开启事务");
//        System.out.println("记录日志");
        System.out.println("getUserById");
        return null;
    }

    @Override
    public int addUser(User u) {
//        System.out.println("开启事务");
//        System.out.println("记录日志");
        System.out.println("addUser");
        return 0;
    }

    @Override
    public int updateUser(User u) {
//        System.out.println("开启事务");
//        System.out.println("记录日志");
        System.out.println("updateUser");
        return 0;
    }

    @Override
    public int delUser(int id) {
//        System.out.println("开启事务");
//        System.out.println("记录日志");
        System.out.println("delUser");
        if (id==1) {
            System.out.println(10/0);
        }
        return 0;
    }
}

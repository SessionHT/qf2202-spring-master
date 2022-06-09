package com.cos.s1.services.impl;

import com.cos.s1.dao.Impl.UserDaoImpl;
import com.cos.s1.dao.UserDao;
import com.cos.s1.services.UserServices;
import lombok.Data;

/**
 * @author: COS
 * @time: 2022/6/2 10:36
 * @description:
 */
//@Data
public class UserServicesImpl implements UserServices{
    private UserDao ud;
    @Override
    public void show() {
        // null . 方法和属性
        // 调用了方法存放了null值,二该方法内就使用了这个对象
//        ud.getAll();
        System.out.println("我就show一下");
    }


    public void init(){
        System.out.println("初始化");
    }
    public void destroy(){
        System.out.println("销毁了");
    }

}

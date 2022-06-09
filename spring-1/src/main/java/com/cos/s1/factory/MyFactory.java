package com.cos.s1.factory;

import java.io.IOException;
import java.util.Properties;

/**
 * @author: COS
 * @time: 2022/6/2 10:03
 * @description:
 */
public class MyFactory {


    public Object getBean(String beanName){
        try {
            Properties pro = new Properties();
            pro.load(MyFactory.class.getResourceAsStream("/app.properties"));
            //获取类的全限定名
            String beanClass = pro.getProperty(beanName);
            //使用反射获取对象实例
            Class<?> aClass = Class.forName(beanClass);
            return aClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

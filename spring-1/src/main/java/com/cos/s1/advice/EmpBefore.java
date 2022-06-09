package com.cos.s1.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

/**
 * @author: COS
 * @time: 2022/6/2 16:51
 * @description: 前置增强   方法前执行的方法
 */
public class EmpBefore implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("前置增强,少年你被加强了快上!!");
        System.out.println(new Date()+"执行了:"+target.getClass().getName());
        System.out.println("方法名为:"+method.getName());
        System.out.println("参数列表是:"+ Arrays.toString(args));
    }
}

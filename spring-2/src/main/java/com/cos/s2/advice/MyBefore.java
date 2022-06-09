package com.cos.s2.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author: COS
 * @time: 2022/6/6 9:26
 * @description:
 */
public class MyBefore implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("这个是前置增强2333");
        System.out.println("目标方法:"+method.getName());
    }
}

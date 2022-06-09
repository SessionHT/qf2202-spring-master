package com.cos.s2.advice;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author: COS
 * @time: 2022/6/6 9:36
 * @description:
 */
public class MyAfter implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("后置方法被执行");
    }
}

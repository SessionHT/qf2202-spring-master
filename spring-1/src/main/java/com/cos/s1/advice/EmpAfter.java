package com.cos.s1.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

/**
 * @author: COS
 * @time: 2022/6/2 17:23
 * @description:
 */
public class EmpAfter implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("后置增强");
        System.out.println("returnValue:"+returnValue);
        System.out.println(new Date()+"执行了:"+target.getClass().getName());
        System.out.println("方法名为:"+method.getName());
        System.out.println("参数列表是:"+ Arrays.toString(args));
    }
}

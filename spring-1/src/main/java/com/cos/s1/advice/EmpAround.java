package com.cos.s1.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author: COS
 * @time: 2022/6/2 17:25
 * @description:
 */
public class EmpAround implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("环绕的前置");
        //放行方法
        Object proceed = invocation.proceed();
        System.out.println("给小姨加钱");
        System.out.println("环绕的后置");
        return proceed;
    }
}

package com.cos.s2.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author: COS
 * @time: 2022/6/6 9:37
 * @description:
 */
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("环绕的前置");
        //放行方法
        Object proceed = invocation.proceed();
        System.out.println("环绕的后置");
        return proceed;
    }
}

package com.cos.s2.advice;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author: COS
 * @time: 2022/6/6 9:38
 * @description:
 */
public class MyExceptionAdvice implements ThrowsAdvice {
    public void afterThrowing(Exception ex){
        System.out.println("异常增强 用于记录异常日志");
    }
}

package com.cos.s1.advice;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author: COS
 * @time: 2022/6/2 17:29
 * @description:
 */
public class EmpThrows implements ThrowsAdvice {
    public void afterThrowing(Exception ex){
        System.out.println("出错啦 哈哈哈");
        ex.printStackTrace();
    }
}

package com.cos.s3.advices;

import com.cos.s3.entity.Dept;
import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: COS
 * @time: 2022/6/7 11:14
 * @description:
 *
 * @Aspect 表示本类是一个切面的类 (切点和增强的组合)
 * @Component 让spring管理本类,这样才能对应生成代理类 jdk接口 cglib父类
 */
@Aspect
@Component
public class MyAdvices {
    /**
     *
     * @author: COS
     * @return:
     * @time: 2022/6/7 11:17
     * @description: 使用空的方法来设置 切点表达式,达到复用,
     * 使用的时候,是以方法名()来使用这个切点表达式
     */
    @Pointcut("execution(* com.cos.s3.services..*.*(..))")
    public void pc(){};

    /**
     *
     * @author: COS
     * @return:
     * @time: 2022/6/7 11:16
     * @description:
     * @Before 设置前置增强
     *
     * JoinPoint 里面包含 目标方法 目标类 参数列表
     */
    @Before("pc()")
    public void before(JoinPoint jp){
        System.out.println("前端");
        System.out.println("方法名:"+jp.getSignature().getName());
        System.out.println("目录类名:"+jp.getTarget().getClass().getSimpleName());
        System.out.println("方法参数"+ Arrays.toString(jp.getArgs()));
    }
//    @Before("pc()")
//    public void before2(JoinPoint jp){
//        System.out.println("前端");
//        System.out.println("方法名:"+jp.getSignature().getName());
//        System.out.println("目录类名:"+jp.getTarget().getClass().getSimpleName());
//        System.out.println("方法参数"+ Arrays.toString(jp.getArgs()));
//    }
    //后置
//    @After()
    @AfterReturning(value = "pc()",returning = "returning")
    public void after(JoinPoint jp,Object returning){
        System.out.println("后置增强");
        System.out.println("方法返回值是:"+returning);
        returning=new Object();
    }
    //环绕
    @Around("pc()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前置");
        Object proceed = pjp.proceed();
        System.out.println("环绕后置置");
//        List<Dept> deptList = new ArrayList<>();
//        deptList.add(new Dept(1,"穷人部"));
//        deptList.add(new Dept(2,"乞丐部"));
//        deptList.add(new Dept(3,"睡大街部"));
//        proceed=deptList;
        return proceed;
    }
    //异常增强
    @AfterThrowing(value = "pc()",throwing = "ex")
    public void getException(Exception ex){
        System.out.println("出现错误为:"+ex.getMessage());
    }


}

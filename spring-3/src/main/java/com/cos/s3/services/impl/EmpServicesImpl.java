package com.cos.s3.services.impl;

import com.cos.s3.dao.EmpDao;
import com.cos.s3.entity.Emp;
import com.cos.s3.services.EmpServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: COS
 * @time: 2022/6/7 9:41
 * @description: 用法是完全一致
 * 在不指定id名的时候,默认为类名首字母小写
 * <bean id="类名首字母小写" class=""/>
 * @Repository 专门用于dao层的注解
 * @Service 专门用于services
 * @Component 专门用于组件 第三方插件 配置类
 * 使用小括号指定 id名字
 * @Service("es")<bean id="es" class=""/>
 */
//@Repository
@Service("es")
//@Component
//@Scope(value = "singleton") 单例多列设置
//注解事务写在雷伤,代表这个类所有方法都使用该事务处理
@Transactional(timeout = 6000,rollbackFor = Exception.class,isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED)//设置注解事务,没有指定时候就应该默认的事务处理 timeout-1
public class EmpServicesImpl implements EmpServices {
    /**
     * 使用自动注入可以省略getSet方法
     */
    /**
     * 属于spring的注解
     * 自动注入的注解
     * 默认使用 byType来进行自动注入
     * 以数据类型来进行自动注入,父类 接口
     * 添加一个注解 @Qualifier("empDao") 指定bean name id的值来进行注入
     * byName
     * 相当于
     * <bean id="es" class="com.cos.s3.services.impl.EmpServicesImpl" autowire="byType|byName">
     */
//    @Autowired
//    @Qualifier("empDao")
    /**
     * @Resource 自动注入的注解 属于java实现的注解 使用反射来实现
     * 首使用byName来自动注入,如果没有找到对应的id存在
     * 就会使用ByType来进行注入
     */
    @Resource
    private EmpDao empDao;
    //在方法上写事务注解,这个方法使用的事务规则,当和类上的事务注解同时存在,方法上的优先
    @Transactional(timeout = 30,readOnly = true)
    @Override
    public void show() {
        System.out.println("执行了");
    }

    @Override
    public List<Emp> getAll() {
        return empDao.getAll();
    }
}

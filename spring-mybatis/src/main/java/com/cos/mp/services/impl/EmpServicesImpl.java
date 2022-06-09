package com.cos.mp.services.impl;

import com.cos.mp.dao.EmpDao;
import com.cos.mp.entity.Emp;
import com.cos.mp.services.EmpServices;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

/**
 * @author: COS
 * @time: 2022/6/6 10:53
 * @description: <bean id="" class=""></bean>
 * @Repository
 * @Service
 * @Component
 * 都是相当于下面的标签
 * <bean id="empServicesImpl" class="com.cos.mp.services.impl.EmpServicesImpl">
 * 当@Service没有小括号默认的id的值是类名首字母小写
 * 可以手动设置id的值@Service("es")
 * <bean id="es" class="com.cos.mp.services.impl.EmpServicesImpl">
 */
//@Repository//专门用于dao层的标签
@Service("es")  //专门用于serivce层的标签
//@Component //用于除开 dao / services /controller 以外其他所有需要交spring管理的标签,第三方组件使用如:定时器
public class EmpServicesImpl implements EmpServices {
    //spring DI 注入
    private EmpDao empDao;
//5//5//2

    //12
    //10
    //mvc ssm mybatis-plus shiro springboot
    //vue springcloud

    @Override
    public int addEmp(Emp emp) throws FileNotFoundException {
        int i = empDao.addEmp(emp);
        if (emp.getEno() % 2 == 0) {
            FileInputStream fis = new FileInputStream("");
        }
        return 0;
    }

    @Override
    public int delEmp(int eno) {
        int i = empDao.delEmp(eno);
        if (eno % 2 == 0) {
            //有执行回滚
            System.out.println(10 / 0);
        }
        return i;
    }

    @Override
    public List<Emp> getAll() {
        //empDao.getAll();
        System.out.println("执行了");
        return null;
    }

    public EmpDao getEmpDao() {
        return empDao;
    }

    public void setEmpDao(EmpDao empDao) {
        this.empDao = empDao;
    }
}

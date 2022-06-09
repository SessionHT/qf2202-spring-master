package com.cos.s1.services.impl;

import com.cos.s1.entity.Emp;
import com.cos.s1.services.EmpServices;

import java.util.List;

/**
 * @author: COS
 * @time: 2022/6/2 16:49
 * @description:
 */
public class EmpServicesImpl implements EmpServices {
    @Override
    public List<Emp> getAll() {
//        System.out.println(1/0);
        System.out.println("getAll");
        return null;
    }

    @Override
    public Emp getEmpById(int eno) {
        System.out.println("getEmpById");
        return null;
    }

    @Override
    public int addEmp(Emp e) {
        System.out.println("add emp");
        return 0;
    }

    @Override
    public int updateEmp(Emp e) {
        System.out.println("updateEmp");
        return 0;
    }

    @Override
    public int delEmp(int eno) {
        System.out.println("del emp");
        return 0;
    }
}

package com.cos.s1.services;

import com.cos.s1.entity.Emp;

import java.util.List;

/**
 * @author: COS
 * @time: 2022/6/2 16:48
 * @description:
 */
public interface EmpServices {

    List<Emp> getAll();

    Emp getEmpById(int eno);

    int addEmp(Emp e);

    int updateEmp(Emp e);

    int delEmp(int eno);


}

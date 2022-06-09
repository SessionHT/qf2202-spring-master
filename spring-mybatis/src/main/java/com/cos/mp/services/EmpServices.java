package com.cos.mp.services;

import com.cos.mp.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * @author: COS
 * @time: 2022/6/6 10:49
 * @description:
 */
public interface EmpServices {
    List<Emp> getAll();

    int delEmp(int eno);

    int addEmp(Emp emp) throws FileNotFoundException;
}

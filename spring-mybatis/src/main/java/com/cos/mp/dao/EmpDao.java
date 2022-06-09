package com.cos.mp.dao;

import com.cos.mp.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: COS
 * @time: 2022/6/6 10:49
 * @description:
 */
public interface EmpDao {
    List<Emp> getAll();

    int delEmp(@Param("eno") int eno);
    int addEmp(Emp emp);
}

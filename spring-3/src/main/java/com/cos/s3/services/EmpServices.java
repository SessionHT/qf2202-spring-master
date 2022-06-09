package com.cos.s3.services;

import com.cos.s3.entity.Emp;

import java.util.List;

/**
 * @author: COS
 * @time: 2022/6/7 9:39
 * @description:
 */
public interface EmpServices {
    List<Emp> getAll();

    void show();
}

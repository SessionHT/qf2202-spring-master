package com.cos.s3.services;

import com.cos.s3.entity.Dept;

import java.util.List;

/**
 * @author: COS
 * @time: 2022/6/7 10:26
 * @description:
 */
public interface DeptServices {
    List<Dept> getAll();
}

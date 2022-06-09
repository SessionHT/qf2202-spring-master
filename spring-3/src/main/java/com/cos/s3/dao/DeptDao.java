package com.cos.s3.dao;

import com.cos.s3.entity.Dept;

import java.util.List;

/**
 * @author: COS
 * @time: 2022/6/7 10:26
 * @description:
 */
public interface DeptDao {
    List<Dept> getAll();
}

package com.cos.s3.services.impl;

import com.cos.s3.dao.DeptDao;
import com.cos.s3.entity.Dept;
import com.cos.s3.services.DeptServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: COS
 * @time: 2022/6/7 10:27
 * @description:
 */
@Service("ds")
public class DeptServicesImpl implements DeptServices {
    @Autowired
    private DeptDao deptDao;
    @Override
    public List<Dept> getAll() {
       // System.out.println(10/0);
        return deptDao.getAll();
    }

}

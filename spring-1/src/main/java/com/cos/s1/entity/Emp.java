package com.cos.s1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: COS
 * @time: 2022/5/30 11:53
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Emp implements Serializable {
    private Integer eno;
    private String ename;
    private String esex;
    private Double salary;
    private String pwd;
    private Date bornDate;
    private Integer dno;
    /* 对象属性 指emp的部门数据 */

    /* 项目集合 */

    public Emp(String esex) {
        this.esex = esex;
    }

    public Emp(String ename, String esex, Double salary, String pwd, Date bornDate, Integer dno) {
        this.ename = ename;
        this.esex = esex;
        this.salary = salary;
        this.pwd = pwd;
        this.bornDate = bornDate;
        this.dno = dno;
    }
}

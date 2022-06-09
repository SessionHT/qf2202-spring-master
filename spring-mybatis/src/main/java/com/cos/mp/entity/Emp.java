package com.cos.mp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author: COS
 * @time: 2022/6/6 10:07
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Emp {
    private Integer eno;
    private String ename;
    private String esex;
    private Double salary;
    private String pwd;
    private Date bornDate;
    private Integer dno;


}

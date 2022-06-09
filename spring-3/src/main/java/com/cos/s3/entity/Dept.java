package com.cos.s3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author: COS
 * @time: 2022/6/7 10:26
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Dept {
    private int dno;
    private String dname;
}

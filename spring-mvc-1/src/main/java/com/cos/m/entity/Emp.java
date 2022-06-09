package com.cos.m.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author: COS
 * @time: 2022/6/7 16:52
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Emp {
    String username;
    String password;
    Double salary;
    Integer age;
    String sex;
    String[] hobby;
    //设置日期格式化的规则
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date bornDate;
}

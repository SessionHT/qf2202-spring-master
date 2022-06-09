package com.cos.m2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author: COS
 * @time: 2022/6/8 10:30
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer uno;
    private String username;
    private String password ;
    private String sex;
    private Integer age;

    public User(Integer uno, String username, String password, String sex, Integer age) {
        this.uno = uno;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.age = age;
    }
    @JsonIgnore
    private Emp emp;
    @Override
    public String toString() {
        return "{" +
                "\"uno\":" + uno +
                ", \"username\":'" + username + '\'' +
                ", \"password\":'" + password + '\'' +
                ",\"sex\":'" + sex + '\'' +
                ", \"age\":" + age +
                '}';
    }
}   

package com.cos.s1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author: COS
 * @time: 2022/6/2 11:02
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private String username;
    private Integer age;
    private String sex;
    private double salary;
    private Date bornDate;
    private String[] city;
    private List<String> hobby;
    private Set<String> xl;
    private Map<String,String> ruyu;//入狱
    private Address address;

    public User(String username, Integer age, String sex, double salary) {
        this.username = username;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
    }
}

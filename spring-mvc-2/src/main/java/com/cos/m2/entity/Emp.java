package com.cos.m2.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author: COS
 * @time: 2022/6/8 17:03
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Emp {
    @JsonProperty(value = "uname")
    private String username;
    /*
    JsonInclude.Include.NON_EMPTY 只要是空的不管是null还是空字符串"" 都不参与转换
    JsonInclude.Include.NON_NULL 只要是null就不参与转换
     */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String password;
    private String sex;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+8")
    @JSONField(format = "yyyy-MM-dd",name = "xxx",serialize = false)
    private Date bornDate;
    //    @JsonIgnore //在json序列化和反序列化都不操作
    private User user;

    public Emp(String username, String password, String sex, Date bornDate) {
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.bornDate = bornDate;
    }
}

package com.cos.m2.web.controller;

import com.cos.m2.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: COS
 * @time: 2022/6/8 16:28
 * @description:
 * RestController - >@Contrller+@ResponseBody
 * 只能返回json/写出字符串
 */
@RestController
@RequestMapping("/rc")
public class Demo3Controller {
    @RequestMapping("/d1")
    public String d1(){
        return "index";
    }
    @RequestMapping("/d2")
    public User getUser(){
        return new User(1,"杰克逊儿子","213","男",18);
    }
    /**
     *
     * @author: COS
     * @return:
     * @time: 2022/6/8 16:45
     * @description: username=a&password=b&sex=M&age=18
     * Map k username  v a
     *     k username  v a
     *     k username  v a
     *     k username  v a
     *
     *
     *     json 字符串
     */
    @RequestMapping("/d3")
    public String demo3(@RequestBody User user){
        System.out.println(user);
        return "ok";
    }
}

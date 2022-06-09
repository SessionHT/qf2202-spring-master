package com.cos.m2.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: COS
 * @time: 2022/6/8 9:16
 * @description:
 * @RequestMapping不写请求路径即为@RequestMapping("/") 即根目录路径
 */
@Controller
@RequestMapping
public class DemoController {
    /**
     *
     * @author: COS
     * @return:
     * @time: 2022/6/8 9:23
     * @description:
     * ?传参
     * http://localhost:8080/getEmpById?id=111
     * 路径传参
     * http://localhost:8080/getEmpById/789
     */
//    @RequestMapping("/getEmpById/654681{id}6813515")
    @RequestMapping("/getEmpById/{id}")
    public String getEmppById(@PathVariable("id") Integer id){
        System.out.println("接受到的id:"+id);
        return "index";
    }
    @RequestMapping("/getEmpById/{id}/{method}")
    public String getEmpByMethodAndId(@PathVariable("id") Integer id,@PathVariable("method") String method){
        System.out.println("接受到的id:"+id);
        System.out.println("接受到的method:"+method);
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("进来啦");
        return "hello";
    }
    @RequestMapping
    public String world(){
        System.out.println("进来啦233333");
        return "login";
    }

}

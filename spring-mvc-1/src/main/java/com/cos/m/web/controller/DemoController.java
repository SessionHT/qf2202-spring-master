package com.cos.m.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: COS
 * @time: 2022/6/7 14:33
 * @description:
 * @Controller 标识当前类为Controller类
 *
 * @RequestMapping请求映射的注解->请求路径的映射
 *  实际就和@WebServlet("/emp") 一样进行访问路径的映射
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
    /**
     *
     * @author: COS
     * @return:
     * @time: 2022/6/7 14:39
     * @description:
     * http://localhost:8080/demo/hello
     * http://localhost:8080/demo?method=hello
     * \method = RequestMethod.GET 设置请求方式,只能get请求访问,不设置的情况下任何方式的请求都能访问
     */
//    @RequestMapping(value = "/hello",method = RequestMethod.POST)
//    public String hello2(){
//        System.out.println("xxx");
//        return "";
//    }
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        System.out.println("你好啊");
        //"forward:/index.jsp";
        //返回视图的名--->逻辑视图名
        //以转发的方式,帮我们进行道德页面跳转
        return "index";
    }
    @RequestMapping("/world")
    public String world(){
        System.out.println("很不好");
        //redirect:/index.jsp
        //重定向,不会使用视图解析器的前缀和后缀的凭借
//        return "redirect:/index.jsp";
        return "redirect:http:www.baidu.com";
    }
    /**
     * 转发 request
     *      有作用域可以携带数据
     *      一次请求
     *      转发的时候路径不变
     *      只能是本服务器本应用的路径跳转
     * 重定向
     *       没有作用域不能带数据
     *      至少2次请求
     *      重定向路径发生改变
     *      可以访问本服务器本应用以及外部站点
     */
}

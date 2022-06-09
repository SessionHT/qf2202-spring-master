package com.cos.m2.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author: COS
 * @time: 2022/6/8 10:04
 * @description:
 */
@Controller
@RequestMapping("/d2")
public class Demo2Controller {
    @RequestMapping("/d1")
    public String demo(HttpServletRequest request) {
        String name = "admin";
        request.setAttribute("name", name);
        return "index";
    }
    /**
     *
     * @author: COS
     * @return:
     * @time: 2022/6/8 10:07
     * @description:
     * Model model 的传值就是request作用域 常用
     */
    @RequestMapping("/d2")
    public String demo2(Model model) {
        String name = "张三";
        model.addAttribute("name", name);
        return "index";
    }
    @RequestMapping("/d3")
    public ModelAndView demo2() {
        String name = "李四";
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("name", name);
        return mv;
    }
    /**
     *
     * @author: COS
     * @return:
     * @time: 2022/6/8 10:27
     * @description: 使用map传参 常用方式
     */
    @RequestMapping("/d4")
    public String demo3(Map<String,Object> data) {
        data.put("name","王五");
        return "index";
    }
}

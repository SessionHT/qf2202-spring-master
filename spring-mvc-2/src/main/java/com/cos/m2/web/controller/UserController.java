package com.cos.m2.web.controller;

import com.cos.m2.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: COS
 * @time: 2022/6/8 10:31
 * @description:
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/doLogin")
    public String doLogin(String username, String password, Model model, HttpSession session){
        //模拟从数据库获取到user数据进行登录判断
        User u = new User(101,"admin","admin","男",18);
        if (u.getUsername().equals(username)&&u.getPassword().equals(password)) {
            //登录成功
            model.addAttribute("msg", "登陆成功欢迎您");
            session.setAttribute("is_login", u);
            return "index";
        }
        model.addAttribute("msg", "用户名或密码有误");
        //登录失败
        return "login";
    }


    @RequestMapping("/checkName/{username}")
    @ResponseBody
    public String checkName(@PathVariable("username")String username){
        //模拟数据库查找用户名是否存在
        List<String> nameList= Arrays.asList("张三","李四","admin","王五","老六");
        for (String s : nameList) {
            if (s.equals(username)) {
                //存在
                return "1";
            }
        }
        //不存在
        return "0";
    }


    @RequestMapping("/getUserList")
    @ResponseBody
    public List<User> getUserList(){
        List<User> ul = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            ul.add(new User(i,"张"+i,"123",i%2==0?"男":"女",10+i));
        }
        return ul;
    }


}

package com.cos.m2.web.controller;

import com.cos.m2.entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: COS
 * @time: 2022/6/8 14:35
 * @description:
 */
@Controller
@RequestMapping("/json")
public class JsonController {
    /**
     *
     * @author: COS
     * @return:
     * @time: 2022/6/8 14:40
     * @description:
     * 直接使用response写出json
     */
    @RequestMapping(value = "/d1")
    public void demo(HttpServletResponse response) throws IOException {
        User u = new User(1,"杰克逊儿子","213","男",18);
        ObjectMapper om = new ObjectMapper();
        String string = om.writeValueAsString(u);
        response.setContentType("text/html;charset=utf-8");
        //WEB-INF/PAGE/{xczcssf}.jsp
        response.getWriter().println(string);
    }

    @RequestMapping("/d2")
    @ResponseBody//json 注解 如果方法返回值是字符串 就直接原样写出
    public String demo2() throws JsonProcessingException {
        User u = new User(1,"杰克逊儿子","213","男",18);
        ObjectMapper om = new ObjectMapper();
        String string = om.writeValueAsString(u);
        return "whahaahahaha";
    }
    /**
     *
     * @author: COS
     * @return:
     * @time: 2022/6/8 15:20
     * @description:
     * 如果有@ResponseBody注解并且返回值类型是个对象
     * springmvc就会自已去调用jackson帮我们进行对象转json字符串
     * json序列化 操作
     * ?{}
     *
     */
    @RequestMapping("/d3")
    @ResponseBody
    public User demo3(){
        return new User(1,"杰克逊儿子","213","男",18);
    }
    @RequestMapping("/d4")
    @ResponseBody
    public List<User> demo4(){
        List<User> ul = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ul.add(new User(i,"张"+i,"123","?",10+i));
        }
        return ul;
    }


}

package com.cos.m.web.controller;

import com.cos.m.entity.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

/**
 * @author: COS
 * @time: 2022/6/7 16:26
 * @description:
 * 1. 注意转换的数据类型,如果不一致出现400错误
 * 2. 注意日期无法自动转化,会出现400错误可以使用@DateTimeFormat(pattern = "yyyy-MM-dd") 设置格式化规则,才能转换
 * 3. 注意接收参数是方法参数列表,最好不要有基础数据类型,如果接收不到参数会有null出现,基础数据类型就会报错
 * 4. 注意@ReqeustParam
 *             @ReqeustParam("参数名")可以用于设置接受的参数名
 *             如果写上这个注解,就必须提供值,即不能null,否则400错误,可以设置required = false或者是defaultValue = "1111"默认值
 *             他会把map参数把原本的传参改为接受参数
 *
 *  其他的只需要 方法的参数名和传递过来的参数的名称一致即可,如:
 *   password:<input type="password" name="password"/> <br>
 *      public String doLogin(String password){}
 *   使用对象接受参数时,注意对象的属性名也要和参数的名一致
 */
@Controller
@RequestMapping("/emp")
public class EmpController  {

    /**
     *
     * @author: COS
     * @return:
     * @time: 2022/6/7 16:56
     * @description:
     * 让spring 把数据封装到对象当中
     * spring会自己把参数名和属性名一一对应起来进行数据的封装
     * 只要属性名是参数名一致就能封装数据
     */
    @RequestMapping("/reg")
    public String doReg(Emp emp){
        System.out.println(emp);
        return "index";
    }

    /**
     *
     * @author: COS
     * @return:
     * @time: 2022/6/7 16:46
     * @description:
     * @RequestParam 注解设置在map参数前,会把他原有的传参的作用转为接受参数
     * @RequestParam("username") 设置接受的参数的名字
     */
    @RequestMapping("/reg2")
    public String doReg2(@RequestParam Map<String,Object> param){
        System.out.println(param);
        return "index";
    }
    //单个单个的获取
    @RequestMapping("/reg3")
    public String doReg3(String username,String password,Double salary,Integer age,
                         String sex,String[] hobby){
        System.out.println(username);
        System.out.println(password);
        System.out.println(salary);
        System.out.println(age);
        System.out.println(sex);
        System.out.println(Arrays.toString(hobby));
        return "index";
    }


    /**
     *
     * @author: COS
     * @return:
     * @time: 2022/6/7 16:33
     * @description:
     * 形参名字需要和参数名一样
     *
     * @RequestParam(value = "username",required = false) 因为设置上RequestParam后,就必须要提供对象的参数否则报错
     * 可以设置required = false来处理不会报错
     * 可以设置默认值,默认值只有没有对应的参数可以接受时起效
     * RequestParam(value = "username",defaultValue = "1111")
     */
    @RequestMapping("/doLogin")
    public String doLogin(@RequestParam(value = "username",defaultValue = "1111") String uname,
                          int password){
        System.out.println("登录啊");
        System.out.println(uname);
        System.out.println(password);
        return "index";
    }
    // 方式1 不好用
//    public String doLogin(HttpServletRequest request){
//        System.out.println("登录啊");
//        System.out.println(request.getParameter("username"));
//        System.out.println(request.getParameter("password"));
//        return "index";
//    }


}

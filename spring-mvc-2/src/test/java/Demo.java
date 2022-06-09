import com.alibaba.fastjson.JSON;
import com.cos.m2.entity.Emp;
import com.cos.m2.entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: COS
 * @time: 2022/6/8 14:43
 * @description:
 * 1. 对象转json
 * 2. json转对象
 * 3. JsonProperty
 *    JsonFormat
 *    JsonIgnore
 * JSONField
 */
public class Demo {

    @Test
    public void t4(){
        Emp e = new Emp("受害者", "123", "女", new Date());
        String string = JSON.toJSONString(e);
        System.out.println(string);

        Emp emp = JSON.parseObject(string, Emp.class);
        System.out.println(emp);
//        JSON.parar
    }

    @Test
    public void t3() throws IOException {
        Emp e = new Emp("受害者", "123", "女", new Date());
        User user = new User(1, "张三", "123", "女", 22);
        e.setUser(user);
        user.setEmp(e);


        ObjectMapper om = new ObjectMapper();
//        om.enable(SerializationFeature.INDENT_OUTPUT);
        String string = om.writeValueAsString(e);
        System.out.println(string);
        System.out.println("=====================");
//        String replace = string.replace("uname", "username");
//        System.out.println(replace);
        Emp emp = om.readValue(string, Emp.class);
        System.out.println(emp);


    }



    @Test
    public void t1() throws Exception {
        User u = new User(1,"杰克逊儿子","213","男",18);
        System.out.println(u);
        //{"uno":1,"username":"杰克逊儿子","password":"213","sex":"男","age":18}
        /**
         * [
         * {"uno":1,"username":"杰克逊儿子","password":"213","sex":"男","age":18},
         * {"uno":1,"username":"杰克逊儿子","password":"213","sex":"男","age":18},
         * {"uno":1,"username":"杰克逊儿子","password":"213","sex":"男","age":18}
         * ]
         */
        /*
        json 数据
        1.对象是否以{} 包裹
        2. 他的属性名都是字符串
        3. 值 字符串 数值 boolean
        4. 数组 []
        5. 在对象中多个属性使用,分割
         */
        //jackson转换工具
        ObjectMapper om = new ObjectMapper();
        String string = om.writeValueAsString(u);
        System.out.println(string);
        System.out.println("==================");
        List<User> ul = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ul.add(new User(i,"张"+i,"123","?",10+i));
        }

        String string1 = om.writeValueAsString(ul);
        System.out.println(string1);

    }
    @Test
    public void t2() throws Exception{
        String u1 = "{\"uno\":1,\"username\":\"杰克逊儿子\",\"password\":\"213\",\"sex\":\"男\",\"age\":18}";
        //单个对象的转换
        ObjectMapper om = new ObjectMapper();
        User user = om.readValue(u1, User.class);
        System.out.println(user.getUsername());

        String ul = "[{\"uno\":0,\"username\":\"张0\",\"password\":\"123\",\"sex\":\"?\",\"age\":10},{\"uno\":1,\"username\":\"张1\",\"password\":\"123\",\"sex\":\"?\",\"age\":11},{\"uno\":2,\"username\":\"张2\",\"password\":\"123\",\"sex\":\"?\",\"age\":12},{\"uno\":3,\"username\":\"张3\",\"password\":\"123\",\"sex\":\"?\",\"age\":13},{\"uno\":4,\"username\":\"张4\",\"password\":\"123\",\"sex\":\"?\",\"age\":14},{\"uno\":5,\"username\":\"张5\",\"password\":\"123\",\"sex\":\"?\",\"age\":15},{\"uno\":6,\"username\":\"张6\",\"password\":\"123\",\"sex\":\"?\",\"age\":16},{\"uno\":7,\"username\":\"张7\",\"password\":\"123\",\"sex\":\"?\",\"age\":17},{\"uno\":8,\"username\":\"张8\",\"password\":\"123\",\"sex\":\"?\",\"age\":18},{\"uno\":9,\"username\":\"张9\",\"password\":\"123\",\"sex\":\"?\",\"age\":19}]";
        List<User> o = om.readValue(ul, new TypeReference<List<User>>() {});
        System.out.println(o);
    }




}

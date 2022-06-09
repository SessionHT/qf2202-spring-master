import com.cos.s1.entity.Dog;
import com.cos.s1.entity.Pet;
import com.cos.s1.entity.User;
import com.cos.s1.factory.MyFactory;
import com.cos.s1.services.UserServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

/**
 * @author: COS
 * @time: 2022/6/2 9:42
 * @description:
 */
public class Test {

    @org.junit.Test
    public void t4() {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
//        UserServices us1 = (UserServices) ac.getBean("us");
//        UserServices us2 = (UserServices) ac.getBean("us");
//        UserServices us3 = (UserServices) ac.getBean("us");
//        us.show();
//
//        Connection con = (Connection) ac.getBean("con");
//        System.out.println(con);
//        System.out.println(ac.getBean("con"));
//        System.out.println(ac.getBean("con"));
        ac.close();
    }




        @org.junit.Test
    public void t3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
//        UserServices us = (UserServices) ac.getBean("userServices");
//        us.show();
       User u  = (User) ac.getBean("user");
        System.out.println(u);
        u.getAddress().live();
    }
    @org.junit.Test
    public void t2(){
        //实例化工厂类
        MyFactory mf = new MyFactory();
        Pet d = (Pet) mf.getBean("d");
        d.play();
    }
    @org.junit.Test
    public void t1(){
//        //使用狗类
////        Dog d = new Dog();
////        d.play();
//        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
//        Dog dog = (Dog) ac.getBean("dog");
//        dog.play();


    }


}

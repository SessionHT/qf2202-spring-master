import com.cos.s2.services.UserServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: COS
 * @time: 2022/6/6 9:34
 * @description:
 */
public class Demo {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        UserServices us = (UserServices) ac.getBean("userServices");
        us.getAll();
        us.addUser(null);
        us.delUser(0);
        us.updateUser(null);

        us.getUserById(1);
        //多个类需要使用的赋值功能,就可以使用aop
    }
}

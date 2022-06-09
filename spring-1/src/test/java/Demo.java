import com.cos.s1.entity.Emp;
import com.cos.s1.services.EmpServices;
import com.cos.s1.services.UserServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author: COS
 * @time: 2022/6/2 16:55
 * @description:
 */
public class Demo {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        EmpServices empServices = (EmpServices) ac.getBean("empServices");
        int i2 = empServices.addEmp(null);
        System.out.println("-----------------------------------------");
        List<Emp> all = empServices.getAll();
        System.out.println("-----------------------------------------");
        int i1 = empServices.updateEmp(null);
        System.out.println("-----------------------------------------");
        int i = empServices.delEmp(0);
        System.out.println("-----------------------------------------");

        UserServices userServices = (UserServices) ac.getBean("userServices");
        userServices.show();
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");

        System.out.println("-----------------------------------------");
        System.out.println(empServices);
    }
}

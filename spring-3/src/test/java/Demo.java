import com.cos.s3.services.DeptServices;
import com.cos.s3.services.EmpServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: COS
 * @time: 2022/6/7 9:42
 * @description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:application.xml")
public class Demo {
    @Autowired
    DeptServices ds;
    @Autowired
    EmpServices es;

    @Test
    public void t1() {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");

//        EmpServices es = (EmpServices) ac.getBean("es");
//        es.show();
//
//        System.out.println(es.getAll());

//        DeptServices ds = (DeptServices) ac.getBean("ds");
//        System.out.println(ds.getAll());
        System.out.println(es.getAll());
        System.out.println(10/0);
    }


}

import com.cos.mp.dao.EmpDao;
import com.cos.mp.entity.Emp;
import com.cos.mp.services.EmpServices;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;

/**
 * @author: COS
 * @time: 2022/6/6 10:59
 * @description:
 */
public class Demo {
    @Test
    public void t1() throws FileNotFoundException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
//        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) ac.getBean("sqlSessionFactory");
        //重复
//        SqlSession session = sqlSessionFactory.openSession();
//        EmpDao mapper = session.getMapper(EmpDao.class);

        EmpServices empServices = (EmpServices) ac.getBean("es");
//        System.out.println(empServices.getAll());
////        System.out.println(empServices.delEmp(1236));
//        Emp e = new Emp(14,"", "", 1.0, "", null, 101);
//        System.out.println(empServices.addEmp(e));
        empServices.getAll();
    }
}

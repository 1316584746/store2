import com.mgb.dao.EmployeeMapper;
import com.mgb.pojo.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-dao.xml")

public class mybatisTest {
   @Autowired
    private EmployeeMapper employeeMapper;
    @Test
    public  void test(){
        Employee byname = employeeMapper.findByname("jack");
        System.out.println(byname);
    }


     @Test
    public void test03(){
         Employee empl = employeeMapper.getEmpl(1);
         System.out.println(empl);
     }
}

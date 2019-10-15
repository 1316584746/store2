import com.mgb.pojo.Employee;
import com.mgb.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring-dao.xml",
        "classpath:spring-service.xml"
})//对应所需要的配置文件的添加
public class ServiceTest {

    @Autowired
    private EmployeeService employeeService;
     @Test
    public void  test(){
         List<Employee> allEmpl = employeeService.getAllEmpl();
         System.out.println(allEmpl);

     }


}

import com.mgb.dao.EmployeeMapper;
import com.mgb.pojo.Employee;
import com.mgb.pojo.User;
import com.mgb.service.EmployeeService;
import com.mgb.utils.MD5Util;
import com.mgb.utils.commonUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class MyTest {

    @Test
    public  void test01(){


    }

    @Test
    public  void  testSpring(){
//        1.得到Spring框架的上下文对象
       ApplicationContext  context =new ClassPathXmlApplicationContext("spring-config.xml");
//    2.获取Bean对象
        User user =(User) context.getBean("user");
        System.out.println(user);

    }
      @Test
    public  void testmybatis() throws IOException {
         //1.加载配置文件:转化成输入文件
          InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
          //2.获取SessionFactory:session工厂
          SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
          //3.获取session:相当于JDBC中的Connection
          SqlSession session = factory.openSession();
          //4.获取Mapper代理对象
          EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
          //5.实际操作CURD
         // List<Employee> all = mapper.findAll();
          //通过姓名进行查询
          Employee byname = mapper.findByname("jack");

          //6.打印操作结果
          System.out.println(byname);
          //7.关闭资源




      }

  @Test
    public  void testMd5(){
      System.out.println(MD5Util.MD55("1111"));
  }




@Test
 public  void test002(){
    String biaohao= commonUtil.creatEmplNum(99,"SY0001" );
    System.out.println(biaohao);
}


}
import com.mgb.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config-annotation.xml")//加载配置文件
public class SpringTest {

    @Autowired
    private User user;

    @Test
    public void test() {
        System.out.println(user);
    }
}
import com.bao.pojo.Books;
import com.bao.pojo.User;
import com.bao.service.BookService;
import com.bao.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
   public void test()
   {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       UserService userServiceImpl = (UserService) context.getBean("UserServiceImpl");
       User admin = userServiceImpl.queryUserByName("admin");
       System.out.println(admin);
   }
}

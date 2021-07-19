import mavenTest.pojo.Account;
import mavenTest.service.AccountLoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:springApplication.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AccountMapperTest {

    @Autowired //获取spring容器中的bean工厂对象，用于获取容器中所有bean对象
    private BeanFactory beanFactory;

    @Test
    public void testAccount(){
        //模拟用户登录
        AccountLoginService userLoginService= beanFactory.getBean("accountLoginService", AccountLoginService.class);
        Account account = new Account();
        account.setUsername("aaa");
        account.setPassword("123");
        Account account1 = userLoginService.getLoginUser(account);
        System.out.println(account1);
    }

    @Test
    public void testRegister() {
        AccountLoginService userLoginService= beanFactory.getBean("userLoginService", AccountLoginService.class);
        Account account = new Account();
        account.setUsername("Diana2");
        account.setPassword("123456");
        userLoginService.registerUser(account);
    }
}

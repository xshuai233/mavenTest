import mavenTest.pojo.Order;
import mavenTest.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:springApplication.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class OrderMapperTest {

    @Autowired //获取spring容器中的bean工厂对象，用于获取容器中所有bean对象
    private BeanFactory beanFactory;

    @Test
    public void testAdd() {
        OrderService orderService = beanFactory.getBean("orderService", OrderService.class);
        Order order = new Order();
        order.setO_id(2);
        order.setO_date("2");
        order.setO_name("2");
        order.setO_price(2);
        order.setO_user("2");
        orderService.addOrder(order);
    }

    @Test
    public void testDelete() {
        OrderService orderService = beanFactory.getBean("orderService", OrderService.class);
        orderService.deleteOrder(1);
    }

    @Test
    public void TestModify() {
        OrderService orderService = beanFactory.getBean("orderService", OrderService.class);
        orderService.modifyOrder(1, "你好", "2021/7/8", 7.8, "你不好");
    }

    @Test
    public void testQuery() {
        OrderService orderService= beanFactory.getBean("orderService", OrderService.class);
        Order res = orderService.getOrder(1);
        System.out.println(res);
    }
}

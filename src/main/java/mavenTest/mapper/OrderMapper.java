package mavenTest.mapper;
import mavenTest.pojo.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    //添加订单
    public void addOrder(Order order);

    //删除订单
    public void deleteOrder(int o_id);

    //修改订单
    public void modifyOrder(int o_id, String o_name, String o_date, double o_price, String o_user);

    //查询订单
    public Order getOrder(int o_id);
}

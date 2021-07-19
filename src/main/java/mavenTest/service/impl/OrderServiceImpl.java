package mavenTest.service.impl;

import mavenTest.mapper.OrderMapper;
import mavenTest.pojo.Order;
import mavenTest.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public void addOrder(Order order) { orderMapper.addOrder(order); }

    public void deleteOrder(int o_id) { orderMapper.deleteOrder(o_id); }

    public void modifyOrder(int o_id, String o_name, String o_date, double o_price, String o_user) { orderMapper.modifyOrder(o_id, o_name, o_date, o_price, o_user); }

    public Order getOrder(int o_id) { return orderMapper.getOrder(o_id); }
}

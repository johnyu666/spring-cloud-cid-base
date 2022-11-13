package cn.johnyu.order.service.impl;

import cn.johnyu.order.entity.Order;
import cn.johnyu.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class OrderServiceImplTest {
    @Autowired
    private OrderService orderService;
    @Test
    void loadOrder() {
        Order order = orderService.loadOrder(1);
        assertTrue(order.getProduct().getName().equals("显示器"));
    }
}
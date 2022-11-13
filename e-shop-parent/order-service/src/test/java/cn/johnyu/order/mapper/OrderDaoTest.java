package cn.johnyu.order.mapper;

import cn.johnyu.order.po.OrderPo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class OrderDaoTest {
    @Autowired
    private OrderDao orderDao;
    @Test
    void loadOrder() {
        OrderPo orderPo=orderDao.loadOrder(1);
        assertTrue(orderPo.getAmount()==1999);
    }
}
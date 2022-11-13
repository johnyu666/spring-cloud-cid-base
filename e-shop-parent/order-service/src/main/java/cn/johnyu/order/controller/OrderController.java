package cn.johnyu.order.controller;

import cn.johnyu.commons.dto.CommonResult;
import cn.johnyu.order.entity.Order;
import cn.johnyu.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/orders/{oid}")
    public CommonResult<Order> loadOrder(@PathVariable("oid") int oid){
        Order order = orderService.loadOrder(oid);
        return new CommonResult<Order>().setCode(200).setInfo("success").setContent(order);
    }
}

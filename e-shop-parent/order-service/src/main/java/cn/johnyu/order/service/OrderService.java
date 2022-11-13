package cn.johnyu.order.service;

import cn.johnyu.order.entity.Order;

public interface OrderService {
    Order loadOrder(int oid);
}

package org.dhr.one.server.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.dhr.one.api.service.OrdersService;
import org.dhr.one.model.entity.Orders;
import org.dhr.one.model.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class OrderServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public List<Orders> findOrdersByUserId(String id) {
        return ordersMapper.findOrdersByUserId(id);
    }
}

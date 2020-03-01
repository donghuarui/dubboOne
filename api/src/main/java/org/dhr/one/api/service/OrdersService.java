package org.dhr.one.api.service;



import org.dhr.one.model.entity.Orders;

import java.util.List;

/**
 * Interface description
 *
 * @author donghuarui.
 */
public interface OrdersService {

    /**
     * 根据用户id查询订单
     *
     * @param id
     * @return
     */
    List<Orders> findOrdersByUserId(String id);
}

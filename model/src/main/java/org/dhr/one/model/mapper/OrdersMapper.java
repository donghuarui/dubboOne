package org.dhr.one.model.mapper;

import org.dhr.one.model.entity.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Interface description
 *
 * @author donghuarui.
 */
@Repository
public interface OrdersMapper {


    /**
     * Method description
     *
     * @return
     */
    List<Orders> findOrdersByUserId(String id);
}

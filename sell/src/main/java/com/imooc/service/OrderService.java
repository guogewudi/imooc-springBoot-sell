package com.imooc.service;

import com.imooc.dataobject.OrderMaster;
import com.imooc.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @ Author: 庞世伟
 * @ Description:
 * @ Date: Created in 2019/9/17 17:46
 */
public interface OrderService {
    /**
     * 创建订单
     */
    OrderDTO create(OrderDTO OrderDTO);
    /**
     * 查询单个订单
     */
    OrderDTO findOne(String orderId);
    /**
     * 查询订单列表
     */
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);
    /**
     * 取消订单
     */
    OrderDTO cancel(OrderDTO orderDTO);
    /**
     * 完结订单
     */
    OrderDTO finish(OrderDTO orderDTO);
    /**
     * 支付订单
     */
    OrderDTO paid(OrderDTO orderDTO);
}

package com.imooc.dao;

import com.imooc.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ Author: 庞世伟
 * @ Description:
 * @ Date: Created in 2019/9/16 18:14
 */
public interface OrderDetailDao extends JpaRepository<OrderDetail,String> {

    List<OrderDetail> findByOrderId(String orderId);
}

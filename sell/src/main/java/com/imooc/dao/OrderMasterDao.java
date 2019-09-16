package com.imooc.dao;

import com.imooc.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ Author: 庞世伟
 * @ Description:
 * @ Date: Created in 2019/9/16 18:12
 */
public interface OrderMasterDao extends JpaRepository<OrderMaster,String> {

    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);

}

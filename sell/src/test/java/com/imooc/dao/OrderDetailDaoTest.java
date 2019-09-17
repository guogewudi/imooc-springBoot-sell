package com.imooc.dao;

import com.imooc.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailDaoTest {

    @Autowired
    private OrderDetailDao orderDetailDao;

    @Test
    @Transactional
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("xxx");
        orderDetail.setOrderId("xxx");
        orderDetail.setProductId("xxx");
        orderDetail.setProductIcon("xxx");
        orderDetail.setProductName("xxx");
        orderDetail.setProductPrice(new BigDecimal(55));
        orderDetail.setProductQuantity(2);
        OrderDetail result = orderDetailDao.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> result = orderDetailDao.findByOrderId("12");
        Assert.assertNotNull(result.size());
    }
}
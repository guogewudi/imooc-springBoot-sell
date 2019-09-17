package com.imooc.dao;

import com.imooc.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterDaoTest {

    @Autowired
    private OrderMasterDao orderMasterDao;

    private final String OPENID = "110110";

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("456");
        orderMaster.setBuyerName("师弟");
        orderMaster.setBuyerPhone("2333333");
        orderMaster.setBuyerAddress("中和街乙3");
        orderMaster.setBuyerOpenid("220220");
        orderMaster.setOrderAmount(new BigDecimal(2.5));
        OrderMaster result = orderMasterDao.save(orderMaster);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByBuyerOpenid() {
        PageRequest pageRequest = new PageRequest(0,1);
        Page<OrderMaster> result = orderMasterDao.findByBuyerOpenid(OPENID,pageRequest);
        Assert.assertNotNull(result.getTotalElements());
    }

}
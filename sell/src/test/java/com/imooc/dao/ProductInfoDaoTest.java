package com.imooc.dao;

import com.imooc.dataobject.ProductInfo;
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
public class ProductInfoDaoTest {
    @Autowired
    private ProductInfoDao productInfoDao;

    @Test
    @Transactional
    public void saveTest(){
        ProductInfo p1 = new ProductInfo();
        p1.setProductId("123");
        p1.setProductName("橘子");
        p1.setProductPrice(new BigDecimal(2.5));
        p1.setProductStock(100);
        p1.setProductDescription("多汁");
        p1.setProductIcon("http://xxx.jpg");
        p1.setProductStatus(0);
        p1.setCategoryType(2);
        ProductInfo result = productInfoDao.save(p1);
        Assert.assertNotNull(result);
    }
    @Test
    public void findByProductStatus() {
        List<ProductInfo> result = productInfoDao.findByProductStatus(0);
        Assert.assertNotEquals(0,result.size());
    }
}

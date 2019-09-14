package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoServiceImpl productInfoServiceImpl;


    @Test
    @Transactional
    public void save() {
        ProductInfo p1 = new ProductInfo();
        p1.setProductId("456");
        p1.setProductName("桃子");
        p1.setProductPrice(new BigDecimal(3.5));
        p1.setProductStock(10);
        p1.setProductDescription("难吃");
        p1.setProductIcon("http://ttt.jpg");
        p1.setProductStatus(0);
        p1.setCategoryType(2);
        ProductInfo result = productInfoServiceImpl.save(p1);
        Assert.assertNotNull(result);
    }

    @Test
    public void findOne() {
       ProductInfo result =  productInfoServiceImpl.findOne("123");
        Assert.assertEquals("123",result.getProductId());
    }

    @Test
    public void findAll() {
        PageRequest pageRequest = new PageRequest(0,2);
        Page<ProductInfo> result = productInfoServiceImpl.findAll(pageRequest);
        //System.out.println(result.getTotalElements());
        Assert.assertNotEquals(0,result.getTotalElements());
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> result = productInfoServiceImpl.findUpAll();
        Assert.assertNotEquals(0,result.size());
    }
}
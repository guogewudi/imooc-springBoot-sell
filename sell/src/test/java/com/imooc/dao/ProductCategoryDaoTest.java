package com.imooc.dao;

import com.imooc.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {

    @Autowired
    private ProductCategoryDao ProductCategoryDao;

    @Test
    public void findOneTest() {
        ProductCategory ProductCategory = ProductCategoryDao.findOne(1);
        System.out.println(ProductCategory.toString());
    }

}

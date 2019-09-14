package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * @ Author: 庞世伟
 * @ Description: 商品类目service
 * @ Date: Created in 2019/9/11 17:59
 */
public interface CategoryService {
    
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}

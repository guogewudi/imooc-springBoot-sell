package com.imooc.dao;


import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryDao extends JpaRepository<ProductCategory,Integer> {

}

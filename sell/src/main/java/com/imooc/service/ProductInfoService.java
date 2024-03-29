package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductInfoService {

    ProductInfo save(ProductInfo productInfo);

    ProductInfo findOne(String productId);

    Page<ProductInfo> findAll(Pageable pageable);//注意这里返回Page对象

    //查找所有上架商品
    List<ProductInfo> findUpAll();

    //加库存
    void increseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreseStock(List<CartDTO> cartDTOList);

}

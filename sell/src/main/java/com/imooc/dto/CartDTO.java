package com.imooc.dto;

import lombok.Data;

/**
 * @ Author: 庞世伟
 * @ Description: 购物车数据
 * @ Date: Created in 2019/9/19 18:28
 */
@Data
public class CartDTO {

    /** 商品ID */
    private String productId;
    /** 对应商品数量 */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}

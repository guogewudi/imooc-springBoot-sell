package com.imooc.enums;

import lombok.Getter;

/**
 * @ Author: 庞世伟
 * @ Description: 异常返回结果
 * @ Date: Created in 2019/9/19 17:35
 */
@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(10,"商品不存在"),
    PRODUCT_STOCK_ERROR(11,"该商品库存错误"),
    ;
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

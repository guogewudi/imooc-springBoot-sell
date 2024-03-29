package com.imooc.enums;

import lombok.Getter;

/**
 * @ Author: 庞世伟
 * @ Description: 商品状态
 * @ Date: Created in 2019/9/19 17:35
 */
@Getter //利用lombok插件，代替手写get方法
public enum ProductStatusEnum {

    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

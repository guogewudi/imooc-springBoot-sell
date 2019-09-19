package com.imooc.enums;

import lombok.Getter;

/**
 * @ Author: 庞世伟
 * @ Description: 订单状态
 * @ Date: Created in 2019/9/16 17:55
 */
@Getter
public enum OrderStatusEnum {

    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"取消"),
    ;

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

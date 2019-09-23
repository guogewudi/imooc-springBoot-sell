package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * @ Author: 庞世伟
 * @ Description: 处理异常
 * @ Date: Created in 2019/9/19 17:32
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String message) {
        super(message);
        this.code = code;
    }
}

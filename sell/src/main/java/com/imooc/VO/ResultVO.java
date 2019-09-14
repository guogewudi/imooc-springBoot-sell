package com.imooc.VO;

import lombok.Data;

/**
 * @ Author: 庞世伟
 * @ Description: Http请求返回的最外层对象
 * @ Date: Created in 2019/9/14 12:06
 */
@Data
public class ResultVO<T> {

    //错误码
    private Integer code;

    //提示信息
    private String message;

    //返回的具体内容
    private T data;

}

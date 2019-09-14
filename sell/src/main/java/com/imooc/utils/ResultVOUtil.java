package com.imooc.utils;

import com.imooc.VO.ResultVO;

/**
 * @ Author: 庞世伟
 * @ Description: ResultVO的工具类
 * @ Date: Created in 2019/9/14 23:49
 */
public class ResultVOUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMessage("成功！");
        return resultVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer code,String message){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMessage(message);
        return resultVO;
    }

}

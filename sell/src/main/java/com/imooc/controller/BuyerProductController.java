package com.imooc.controller;

import com.imooc.VO.ProductInfoVO;
import com.imooc.VO.ProductVO;
import com.imooc.VO.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @ Author: 庞世伟
 * @ Description: 买家相关
 * @ Date: Created in 2019/9/14 11:31
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @GetMapping("/list")
    public ResultVO list(){
        ProductInfoVO productInfoVO = new ProductInfoVO();

        ProductVO productVO = new ProductVO();
        productVO.setProductInfoVOList(Arrays.asList(productInfoVO));

        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMessage("成功!!!");
        resultVO.setData(Arrays.asList(productVO));

        return resultVO;
    }
}

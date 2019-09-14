package com.imooc.controller;

import com.imooc.VO.ProductInfoVO;
import com.imooc.VO.ProductVO;
import com.imooc.VO.ResultVO;
import com.imooc.dataobject.ProductCategory;
import com.imooc.dataobject.ProductInfo;
import com.imooc.service.CategoryService;
import com.imooc.service.ProductInfoService;
import com.imooc.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ Author: 庞世伟
 * @ Description: 买家相关
 * @ Date: Created in 2019/9/14 11:31
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO list() {

        //1.查询所有上架的商品
        List<ProductInfo> productInfoList = productInfoService.findUpAll();

        //2.查询商品类目（一次性查询）

        //传统方法
        /**
         List<Integer> CategoryTypeList = new ArrayList<>();
         for (ProductInfo productInfo : productList) {
         CategoryTypeList.add(productInfo.getCategoryType());
         }
         */

        //Lambda表达式实现
        List<Integer> CategoryTypeList = productInfoList.stream()
                .map(e -> e.getCategoryType())
                .collect(Collectors.toList());
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(CategoryTypeList);

        //3.数据拼装
            //遍历的都是上面两步中准备好的数据
            //先拼接ProductVO的数据，根据API的[]括号可知是一个list
        List<ProductVO> productVOList = new ArrayList<>();
        for(ProductCategory productCategory :productCategoryList){
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());

            //ProductVO里的第三个属性需要ProproductInfoVO，根据API可知也是个list
            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for(ProductInfo productInfo:productInfoList){
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    //spring提供的工具类，可以将第一个位置的类中属性赋值给第二个位置类对应的属性
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtil.success(productVOList);
    }
}

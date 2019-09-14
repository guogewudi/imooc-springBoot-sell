package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @ Author: 庞世伟
 * @ Description: 商品信息表
 * @ Date: Created in 2019/9/14 9:55
 */
@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    /** 名称. */
    private String productName;

    /** 单价. */
    private BigDecimal productPrice;

    /** 库存. */
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 状态. */
    private Integer productStatus;

    /** 类目. */
    private Integer categoryType;

}

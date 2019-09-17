package com.imooc.dto;

import com.imooc.dataobject.OrderDetail;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @ Author: 庞世伟
 * @ Description: 订单的DTO(数据传输对象)
 * @ Date: Created in 2019/9/17 17:53
 */

public class OrderDTO {
    /** 订单ID. */

    private String orderId;

    /** 买家名字. */
    private String buyerName;

    /** 买家电话. */
    private String buyerPhone;

    /** 买家地址. */
    private String buyerAddress;

    /** 买家微信openid. */
    private String buyerOpenid;

    /** 订单总金额. */
    private BigDecimal orderAmount;

    /** 订单状态,默认0新下单.*/
    private Integer orderStatus;

    /** 支付状态. 默认0未支付*/
    private Integer payStatus;

    /** 创建时间. */
    private Date createTime;

    /** 修改时间. */
    private Date updateTime;

    private List<OrderDetail> orderDetailList;
}

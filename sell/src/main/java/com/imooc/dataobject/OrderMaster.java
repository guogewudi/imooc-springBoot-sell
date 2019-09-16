package com.imooc.dataobject;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ Author: 庞世伟
 * @ Description: 订单表
 * @ Date: Created in 2019/9/16 17:47
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    /** 订单ID. */
    @Id
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
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /** 支付状态. 默认0未支付*/
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /** 创建时间. */
    private Date createTime;

    /** 修改时间. */
    private Date updateTime;
}

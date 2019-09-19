package com.imooc.utils;

import java.util.Random;

/**
 * @ Author: 庞世伟
 * @ Description: 产生随机数
 * @ Date: Created in 2019/9/19 18:03
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格 :式 : 时间+随机数
     */
    public static synchronized String genUniqueKey() { //该方法加同步锁，防止高并发重复产生

        Random random = new Random();//随机数

        Integer number = random.nextInt(900000) + 100000;//六位数

        return System.currentTimeMillis() + String.valueOf(number);
    }
}

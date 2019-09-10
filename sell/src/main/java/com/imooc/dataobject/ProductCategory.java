package com.imooc.dataobject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ Author: 庞世伟
 * @ Description: 商品类目表
 * @ Date: Created in 2019/9/10 17:31
 */
@Entity
public class ProductCategory {
    /** 类目id.*/
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名字.*/
    private String categoreName;

    /** 类目编号.*/
    private String categoreType;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoreName() {
        return categoreName;
    }

    public void setCategoreName(String categoreName) {
        this.categoreName = categoreName;
    }

    public String getCategoreType() {
        return categoreType;
    }

    public void setCategoreType(String categoreType) {
        this.categoreType = categoreType;
    }

    @Override
    public String toString() {
        return "ProductCategory{" +
                "categoryId=" + categoryId +
                ", categoreName='" + categoreName + '\'' +
                ", categoreType='" + categoreType + '\'' +
                '}';
    }
}

package com.mytatis.dto;

import java.io.Serializable;

/**
 * Created by zhangyuanyuan031 on 2017/1/20.
 */
public class OrdersEntity implements Serializable {
    private Integer id;
    private String no;
    private Float price;

    @Override
    public String toString() {
        return "OrdersEntity{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", price=" + price +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}

package com.mytatis.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhangyuanyuan031 on 2017/1/20.
 */
public class CustomerEntity  implements Serializable{
    private Integer id;
    private String name;
    private Integer age;
    private List<OrdersEntity> ordersEntityList;

    public List<OrdersEntity> getOrdersEntityList() {
        return ordersEntityList;
    }

    public void setOrdersEntityList(List<OrdersEntity> ordersEntityList) {
        this.ordersEntityList = ordersEntityList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", ordersEntityList=" + ordersEntityList +
                '}';
    }
}

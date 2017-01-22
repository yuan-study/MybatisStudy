package com.mytatis.dto;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

/**
 * Created by zhangyuanyuan031 on 2017/1/22.
 */
@Alias(value = "_book")
public class Book implements Serializable {
    private String id;
    private String bookName;
    private Float price;

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}

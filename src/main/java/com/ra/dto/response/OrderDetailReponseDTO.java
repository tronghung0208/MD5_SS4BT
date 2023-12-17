package com.ra.dto.response;

import com.ra.entity.Product;

import java.util.List;

public class OrderDetailReponseDTO {
    private Integer id;
    private String productName;
    private Double price;
    private Integer quantity;

    public OrderDetailReponseDTO() {
    }

    public OrderDetailReponseDTO(Integer id, String productName, Double price, Integer quantity) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

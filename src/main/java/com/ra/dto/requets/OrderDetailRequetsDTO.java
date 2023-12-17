package com.ra.dto.requets;

public class OrderDetailRequetsDTO {
private Integer product_id;
private  Integer quantity;

    public OrderDetailRequetsDTO() {
    }

    public OrderDetailRequetsDTO(Integer product_id, Integer quantity) {
        this.product_id = product_id;
        this.quantity = quantity;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

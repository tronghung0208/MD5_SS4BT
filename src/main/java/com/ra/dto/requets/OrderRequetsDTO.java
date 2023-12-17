package com.ra.dto.requets;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class OrderRequetsDTO {
    private String addressShip;
    private String phone;
    private String note;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date create_at;

    public OrderRequetsDTO() {
    }
    public OrderRequetsDTO(String addressShip, String phone, String note, Date create_at) {
        this.addressShip = addressShip;
        this.phone = phone;
        this.note = note;
        this.create_at = create_at;
    }

    public String getAddressShip() {
        return addressShip;
    }

    public void setAddressShip(String addressShip) {
        this.addressShip = addressShip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }
}

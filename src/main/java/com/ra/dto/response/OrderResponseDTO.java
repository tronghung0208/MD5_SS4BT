package com.ra.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

public class OrderResponseDTO {
    private Integer id;
    private String addressShip;
    private String phone;
    private String note;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date create_at;
    private Boolean status;
    private String userName;

    public OrderResponseDTO() {
    }

    public OrderResponseDTO(Integer id, String addressShip, String phone, String note, Date create_at, Boolean status, String userName) {
        this.id = id;
        this.addressShip = addressShip;
        this.phone = phone;
        this.note = note;
        this.create_at = create_at;
        this.status = status;
        this.userName = userName;
    }

    public OrderResponseDTO(Iterable<Integer> id, String addressShip, String phone, String note, Date createAt, Boolean status, String fullName) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

package com.ra.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private String addressShip;
    @NotNull
    private String phone;
    private String note;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date create_at;
    private Boolean status;
    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user;

    @OneToMany(mappedBy = "order")
    private Set<OrderDetail> orderDetails =new HashSet<>();

    public Orders() {
    }

    public Orders(Integer id, String addressShip, String phone, String note, Date create_at, Boolean status, User user, Set<OrderDetail> orderDetails) {
        this.id = id;
        this.addressShip = addressShip;
        this.phone = phone;
        this.note = note;
        this.create_at = create_at;
        this.status = status;
        this.user = user;
        this.orderDetails = orderDetails;
    }

    public Orders(String addressShip, String phone, String note, Date create_at, Boolean status, User user) {
        this.addressShip = addressShip;
        this.phone = phone;
        this.note = note;
        this.create_at = create_at;
        this.status = status;
        this.user = user;

    }

    public Iterable<Integer> getId() {
        return Collections.singleton(id);
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Set<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}

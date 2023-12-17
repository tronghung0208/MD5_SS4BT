package com.ra.dto.response;

import java.util.List;

public class OrderRespon {
    private  Integer idOder;
    private String userName;
private List<OrderDetailReponseDTO> orderDetailReponseDTOS;

    public OrderRespon() {
    }

    public OrderRespon(Integer idOder, String userName, List<OrderDetailReponseDTO> orderDetailReponseDTOS) {
        this.idOder = idOder;
        this.userName = userName;
        this.orderDetailReponseDTOS = orderDetailReponseDTOS;
    }

    public OrderRespon(Iterable<Integer> id, String fullName, List<OrderDetailReponseDTO> orderDetailReponseDTOList) {
    }

    public Integer getIdOder() {
        return idOder;
    }

    public void setIdOder(Integer idOder) {
        this.idOder = idOder;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<OrderDetailReponseDTO> getOrderDetailReponseDTOS() {
        return orderDetailReponseDTOS;
    }

    public void setOrderResponseDTOs(List<OrderDetailReponseDTO> orderDetailReponseDTOS) {
        this.orderDetailReponseDTOS = orderDetailReponseDTOS;
    }
}

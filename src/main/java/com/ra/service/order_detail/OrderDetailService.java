package com.ra.service.order_detail;

import com.ra.dto.requets.OrderDetailRequetsDTO;
import com.ra.dto.response.OrderDetailReponseDTO;
import com.ra.dto.response.OrderRespon;
import com.ra.entity.OrderDetail;
import com.ra.exception.CustomException;
import com.ra.service.IGenericService;

import java.util.List;

public interface OrderDetailService extends IGenericService<OrderDetailRequetsDTO,Integer> {
    List<OrderDetailReponseDTO> getAllOderDetail();
    OrderRespon addNewOderDetail(OrderDetailRequetsDTO detailRequetsDTO, Integer id) throws CustomException;
}

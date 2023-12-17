package com.ra.service.order;

import com.ra.dto.requets.OrderRequetsDTO;
import com.ra.dto.response.OrderResponseDTO;
import com.ra.entity.Orders;
import com.ra.exception.CustomException;
import com.ra.service.IGenericService;

import java.util.List;

public interface OrderService extends IGenericService<OrderRequetsDTO,Integer> {
    List<OrderResponseDTO> getAllOrder();
    Orders addNewOrderToUserByIdUser(OrderRequetsDTO requetsDTO,Integer id) throws CustomException;
}

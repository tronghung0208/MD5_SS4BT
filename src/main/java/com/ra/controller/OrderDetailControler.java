package com.ra.controller;

import com.ra.dto.requets.OrderDetailRequetsDTO;
import com.ra.dto.response.OrderDetailReponseDTO;
import com.ra.dto.response.OrderRespon;
import com.ra.exception.CustomException;
import com.ra.service.order_detail.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order-detail")
public class OrderDetailControler {
    @Autowired
    OrderDetailService orderDetailService;
    @PostMapping("/{idUser}")
    public ResponseEntity<OrderRespon> addNewOderDetail(@RequestBody
    OrderDetailRequetsDTO orderDetailRequetsDTO,@PathVariable Integer idUser) throws CustomException {
return new ResponseEntity<>(orderDetailService.addNewOderDetail(orderDetailRequetsDTO,idUser),HttpStatus.CREATED);
    }


}

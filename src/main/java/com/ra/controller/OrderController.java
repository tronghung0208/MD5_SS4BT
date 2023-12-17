package com.ra.controller;

import com.ra.dto.requets.OrderRequetsDTO;
import com.ra.dto.response.OrderResponseDTO;
import com.ra.entity.Orders;
import com.ra.exception.CustomException;
import com.ra.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/{idUser}")
    public ResponseEntity<Orders> addNewOrderToUserByIdUser(@PathVariable Integer idUser,@RequestBody OrderRequetsDTO requetsDTO) throws CustomException {
        return new ResponseEntity<>(orderService.addNewOrderToUserByIdUser(requetsDTO,idUser), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<OrderResponseDTO>> getAllOder(){
        return new ResponseEntity<>(orderService.getAllOrder(),HttpStatus.OK);
    }
}

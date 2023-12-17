package com.ra.service.order_detail;

import com.ra.dto.requets.OrderDetailRequetsDTO;
import com.ra.dto.response.OrderDetailReponseDTO;
import com.ra.dto.response.OrderRespon;
import com.ra.dto.response.OrderResponseDTO;
import com.ra.entity.OrderDetail;
import com.ra.entity.Orders;
import com.ra.entity.Product;
import com.ra.entity.User;
import com.ra.exception.CustomException;
import com.ra.repository.IOderDetailRepository;
import com.ra.repository.OrderRepsitory;
import com.ra.repository.ProductRepository;
import com.ra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    @Autowired
    IOderDetailRepository oderDetailRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    OrderRepsitory orderRepsitory;
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<OrderDetailRequetsDTO> findAll() {
        return null;
    }

    @Override
    public OrderDetailRequetsDTO findById(Integer integer) {
        return null;
    }

    @Override
    public OrderDetailRequetsDTO save(OrderDetailRequetsDTO detailRequetsDTO) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public List<OrderDetailReponseDTO> getAllOderDetail() {
        return null;
    }

    @Override
    public OrderRespon addNewOderDetail(OrderDetailRequetsDTO orderDetailRequetsDTO, Integer idUser) throws CustomException {
        User user = userRepository.findById(idUser).orElseThrow(() -> new CustomException("User not found"));
        List<OrderDetailReponseDTO> reponseDTOList = new ArrayList<>();
        Optional<Orders> orders = orderRepsitory.findByStatus(false);
        if (orders.isPresent()) {
            Product product = productRepository.findById(orderDetailRequetsDTO.getProduct_id()).orElseThrow(() -> new CustomException("Product not found"));
            OrderDetail orderDetail = new OrderDetail(
                    orderDetailRequetsDTO.getQuantity(),
                    product.getPrice(),
                    product,
                    orders.get()
            );
            oderDetailRepository.save(orderDetail);
            List<OrderDetailReponseDTO> orderDetailReponseDTOList = oderDetailRepository.findAllById(orders.get().getId())
                    .stream()
                    .map(item -> new OrderDetailReponseDTO(
                            item.getId(),
                            item.getProduct().getProduct_name(),
                            item.getPrice(),
                            item.getQuantity()
                    ))
                    .toList();
            OrderRespon orderRespon = new OrderRespon(
                    orders.get().getId(),
                    user.getFullName(),
                    orderDetailReponseDTOList
            );
            return orderRespon;
        }


        throw new CustomException("order not found");
    }

}

package com.ra.service.order;

import com.ra.dto.requets.OrderRequetsDTO;
import com.ra.dto.response.OrderResponseDTO;
import com.ra.entity.Orders;
import com.ra.entity.User;
import com.ra.exception.CustomException;
import com.ra.repository.OrderRepsitory;
import com.ra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepsitory orderRepsitory;
    @Autowired
    UserRepository userRepository;

    @Override
    public List<OrderRequetsDTO> findAll() {
        return null;
    }

    @Override
    public OrderRequetsDTO findById(Integer integer) {
        return null;
    }

    @Override
    public OrderRequetsDTO save(OrderRequetsDTO requetsDTO) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public List<OrderResponseDTO> getAllOrder() {
        List<OrderResponseDTO> list = new ArrayList<>();

        orderRepsitory.findAll().forEach(order -> {
            OrderResponseDTO dto = new OrderResponseDTO(
                    order.getId(),
                    order.getAddressShip(),
                    order.getPhone(),
                    order.getNote(),
                    order.getCreate_at(),
                    order.getStatus(),
                    order.getUser().getFullName()
            );
            list.add(dto);
        });
        return list;
    }

    @Override
    public Orders addNewOrderToUserByIdUser(OrderRequetsDTO requetsDTO, Integer idUser) throws CustomException {
        Optional<User> optionalUsers = userRepository.findById(idUser);
        if (optionalUsers.isPresent()) {
            User user = optionalUsers.get();
            Orders orders = new Orders(
                    requetsDTO.getAddressShip(),
                    requetsDTO.getPhone(),
                    requetsDTO.getNote(),
                    requetsDTO.getCreate_at(),
                    false,
                    user
            );
            System.out.println(orderRepsitory.save(orders));
            return orderRepsitory.save(orders);
        }

        throw new CustomException("user not found");

    }
}

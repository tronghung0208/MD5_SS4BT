package com.ra.repository;

import com.ra.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IOderDetailRepository extends JpaRepository<OrderDetail,Integer> {
    List<OrderDetail> findAllByOrderId(Integer idOrder);

    Optional<OrderDetail> findByOrdersIdAndProductId(Long idOrder, Integer productId);
}

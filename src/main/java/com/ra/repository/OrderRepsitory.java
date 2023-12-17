package com.ra.repository;

import com.ra.entity.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface OrderRepsitory extends CrudRepository<Orders,Integer> {
    Optional<Orders> findByStatus(Boolean status);
}

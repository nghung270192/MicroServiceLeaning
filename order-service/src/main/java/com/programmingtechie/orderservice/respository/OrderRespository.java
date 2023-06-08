package com.programmingtechie.orderservice.respository;

import com.programmingtechie.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRespository extends JpaRepository<Order, Long> {
}

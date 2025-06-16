package com.frigildo.curse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frigildo.curse.entitys.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

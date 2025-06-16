package com.frigildo.curse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frigildo.curse.entitys.OrderItem;
import com.frigildo.curse.entitys.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}

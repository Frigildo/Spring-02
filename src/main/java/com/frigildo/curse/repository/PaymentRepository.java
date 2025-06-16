package com.frigildo.curse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frigildo.curse.entitys.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}

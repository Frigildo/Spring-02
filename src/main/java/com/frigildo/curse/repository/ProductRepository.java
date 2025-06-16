package com.frigildo.curse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frigildo.curse.entitys.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

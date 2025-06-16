package com.frigildo.curse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frigildo.curse.entitys.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

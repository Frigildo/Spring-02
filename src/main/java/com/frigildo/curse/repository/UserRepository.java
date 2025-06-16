package com.frigildo.curse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frigildo.curse.entitys.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

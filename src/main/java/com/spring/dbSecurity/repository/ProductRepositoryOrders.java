package com.spring.dbSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.dbSecurity.entity.Orders;

public interface ProductRepositoryOrders extends JpaRepository<Orders, Long> {

}

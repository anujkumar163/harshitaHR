package com.spring.dbSecurity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.dbSecurity.entity.Items;

public interface ProductRepositoryItems extends JpaRepository<Items, Long> {
	Optional<Items> findByOrderId(long orderId);
}

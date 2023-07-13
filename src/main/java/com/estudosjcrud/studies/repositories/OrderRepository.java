package com.estudosjcrud.studies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudosjcrud.studies.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}

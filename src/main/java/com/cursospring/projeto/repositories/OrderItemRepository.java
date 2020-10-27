package com.cursospring.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.projeto.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	

}

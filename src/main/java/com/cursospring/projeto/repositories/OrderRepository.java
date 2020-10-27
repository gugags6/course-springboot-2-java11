package com.cursospring.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}

package com.cursospring.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.projeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}

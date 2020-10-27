package com.cursospring.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.projeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}

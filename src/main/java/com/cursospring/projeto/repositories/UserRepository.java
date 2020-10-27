package com.cursospring.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}

package com.filipesouza.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.filipesouza.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Integer>{
	
}

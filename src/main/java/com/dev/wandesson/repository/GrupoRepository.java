package com.dev.wandesson.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.wandesson.models.Grupo;

public interface GrupoRepository extends JpaRepository<Grupo, Long>{
	
	Grupo findById(long id);
}

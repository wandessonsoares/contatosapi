package com.dev.wandesson.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.wandesson.models.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone,Long> {

	Telefone findById(long id);
	Telefone deleteById(long id);
}

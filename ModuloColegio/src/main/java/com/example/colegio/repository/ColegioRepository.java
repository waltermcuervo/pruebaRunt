package com.example.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.colegio.domain.ColegioVo;

public interface ColegioRepository extends JpaRepository<ColegioVo, Long> {
	
	

}

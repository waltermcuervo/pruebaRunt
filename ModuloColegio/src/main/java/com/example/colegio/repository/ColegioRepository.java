package com.example.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.colegio.domain.ColegioVo;

@Repository
public interface ColegioRepository extends JpaRepository<ColegioVo, Long> {
	
	

}

package com.example.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.colegio.domain.ProfesorVo;

@Repository
public interface ProfesorRepository extends JpaRepository<ProfesorVo, Long>{
	
	

}

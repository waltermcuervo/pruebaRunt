package com.example.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.colegio.domain.CursoVo;

public interface CursoRepository extends JpaRepository<CursoVo, Long>{

}

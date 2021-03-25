package com.example.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.colegio.domain.CursoVo;

@Repository
public interface CursoRepository extends JpaRepository<CursoVo, Long>{

}

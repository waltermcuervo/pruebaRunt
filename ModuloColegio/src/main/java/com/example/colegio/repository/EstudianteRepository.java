package com.example.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.colegio.domain.EstudianteVo;

public interface EstudianteRepository extends JpaRepository<EstudianteVo, Long>{

}

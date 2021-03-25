package com.example.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.colegio.domain.EstudianteVo;

@Repository
public interface EstudianteRepository extends JpaRepository<EstudianteVo, Long>{

}

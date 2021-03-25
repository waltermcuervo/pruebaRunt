package com.example.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.colegio.domain.AsignaturaVo;

public interface AsignaturaRepository  extends JpaRepository<AsignaturaVo, Long>{

}

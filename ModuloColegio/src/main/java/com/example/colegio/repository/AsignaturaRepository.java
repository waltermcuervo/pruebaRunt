package com.example.colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.colegio.domain.AsignaturaVo;

@Repository
public interface AsignaturaRepository  extends JpaRepository<AsignaturaVo, Long>{

}

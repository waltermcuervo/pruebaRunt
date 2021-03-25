package com.example.colegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.colegio.domain.ConsultaAsignaturasVo;
import com.example.colegio.repository.ConsultaAsignaturasRepository;

@Service
public class ConsultaService {
	
	@Autowired ConsultaAsignaturasRepository asignaturasRepository;
	
	public List<ConsultaAsignaturasVo> find(Integer id){
		return asignaturasRepository.obtenerAsignaturas(id);
	}

}

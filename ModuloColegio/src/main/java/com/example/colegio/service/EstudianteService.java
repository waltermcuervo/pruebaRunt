package com.example.colegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.colegio.domain.EstudianteVo;
import com.example.colegio.repository.EstudianteRepository;

@Service
public class EstudianteService {
	
	@Autowired EstudianteRepository estudianteRepository;
	
	public List<EstudianteVo> findAll(){
		return estudianteRepository.findAll();
	}

}

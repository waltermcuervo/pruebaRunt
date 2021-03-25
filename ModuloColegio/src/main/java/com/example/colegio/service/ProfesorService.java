package com.example.colegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.colegio.domain.ProfesorVo;
import com.example.colegio.repository.ProfesorRepository;

@Service
public class ProfesorService {

	@Autowired ProfesorRepository profesorRepository;
	
	public ProfesorVo create(ProfesorVo profesorVo) {
		if(profesorVo.getNombre() == null || profesorVo.getNombre().isEmpty()) {
			throw new RuntimeException();
		}
		return profesorRepository.save(profesorVo);
	}
	
	public List<ProfesorVo> findAll(){
		return profesorRepository.findAll();
	}
}

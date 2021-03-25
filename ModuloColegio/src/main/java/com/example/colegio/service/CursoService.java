package com.example.colegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.colegio.domain.CursoVo;
import com.example.colegio.repository.CursoRepository;

@Service
public class CursoService {
	
	@Autowired CursoRepository cursoRepository;
	
	public CursoVo create(CursoVo vo) {
		if(vo.getIdCurso() == null) {
			throw new RuntimeException();
		}
		return cursoRepository.save(vo);
	}
	
	public List<CursoVo> findAll(){
		return cursoRepository.findAll();
	}

}

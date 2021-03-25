package com.example.colegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.colegio.domain.AsignaturaVo;
import com.example.colegio.repository.AsignaturaRepository;

@Service
public class AsignaturaService {
	
	@Autowired AsignaturaRepository asignaturaRepository;
	
	public List<AsignaturaVo> findAll(){
		return asignaturaRepository.findAll();
	}

}

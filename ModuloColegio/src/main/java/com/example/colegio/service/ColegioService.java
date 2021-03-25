package com.example.colegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.colegio.domain.ColegioVo;
import com.example.colegio.repository.ColegioRepository;

@Service
public class ColegioService {
	
	@Autowired ColegioRepository colegioRepository;
	
	public List<ColegioVo> findAll(){
		return colegioRepository.findAll();
	}

}

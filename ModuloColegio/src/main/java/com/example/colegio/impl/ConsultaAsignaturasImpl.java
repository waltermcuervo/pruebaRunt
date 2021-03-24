package com.example.colegio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.colegio.repository.ConsultaAsignaturasRepository;
import com.example.colegio.service.IConsultaAsignaturas;
import com.example.colegio.vo.ConsultaAsignaturasVo;
import com.example.colegio.vo.ProfesorVo;

@Service
public class ConsultaAsignaturasImpl implements IConsultaAsignaturas{
	
	@Autowired
	private ConsultaAsignaturasRepository rep;

	@Override
	public List<ProfesorVo> listaProfesores() throws Exception {
		try {
			return rep.obtenerProfesores();
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@Override
	public List<ConsultaAsignaturasVo> listaAsignaturas(Integer idProfesor) throws Exception {
		try {
			return rep.obtenerAsignaturas(idProfesor);
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

}

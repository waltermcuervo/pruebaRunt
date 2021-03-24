package com.example.colegio.service;

import java.util.List;

import com.example.colegio.vo.ConsultaAsignaturasVo;
import com.example.colegio.vo.ProfesorVo;

public interface IConsultaAsignaturas {
	public List<ProfesorVo> listaProfesores() throws Exception;
	public List<ConsultaAsignaturasVo> listaAsignaturas(Integer idProfesor) throws Exception;
}

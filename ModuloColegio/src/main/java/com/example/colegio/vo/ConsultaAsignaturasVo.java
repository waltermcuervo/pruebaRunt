package com.example.colegio.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConsultaAsignaturasVo {
	
	private Integer idEstudiante;
	private String nombreEstudiante;
	private Integer idAsignatura;
	private String nombreAsignatura;
	private Integer idCurso;
	private String nombreCurso;
	private Integer idProfesor;
	private String nombreProfesor;
}

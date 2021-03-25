package com.example.colegio.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="ASIGNATURA")
public class AsignaturaVo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAsignatura;
	
	@Column(length = 100)
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="FK_idProfesor")
	private ProfesorVo profesor;
	
	@ManyToOne
	@JoinColumn(name = "FK_idCurso")
	private CursoVo curso;
	
	@ManyToMany
	private List<EstudianteVo> estudiantes;

}

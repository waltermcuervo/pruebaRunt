package com.example.colegio.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="ESTUDIANTE")
public class EstudianteVo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEstudiante;
	
	@Column(length = 100, unique = true)
	private String nombre;
	
	@ManyToMany
	private List<AsignaturaVo> asignaturas;

}

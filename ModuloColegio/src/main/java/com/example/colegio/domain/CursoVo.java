package com.example.colegio.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="CURSO")
public class CursoVo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCurso;
	
	@ManyToOne
	@JoinColumn(name = "FK_idColegio")
	private ColegioVo colegioVo;
	
	private String grado;
	
	private String salon;
	
	@OneToMany
	private List<AsignaturaVo> asignaturas;


}

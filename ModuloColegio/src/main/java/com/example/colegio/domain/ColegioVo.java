package com.example.colegio.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="COLEGIO")
public class ColegioVo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idColegio;
	
	@Column(length = 100, unique = true)
	private String nombre;
	
	@OneToMany
	private List<CursoVo> cursos;
}

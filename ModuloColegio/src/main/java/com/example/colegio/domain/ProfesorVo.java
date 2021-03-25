package com.example.colegio.domain;

import java.util.List;
import java.util.Set;

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
@Table(name="PROFESOR")
public class ProfesorVo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProfesor;
	
	@Column(length = 100, unique = true)
	private String nombre;
	
	@OneToMany
	private List<AsignaturaVo> asignaturas;
}

package com.example.colegio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.colegio.domain.AsignaturaVo;
import com.example.colegio.domain.ColegioVo;
import com.example.colegio.domain.ConsultaAsignaturasVo;
import com.example.colegio.domain.CursoVo;
import com.example.colegio.domain.EstudianteVo;
import com.example.colegio.domain.ProfesorVo;
import com.example.colegio.service.AsignaturaService;
import com.example.colegio.service.ColegioService;
import com.example.colegio.service.ConsultaService;
import com.example.colegio.service.CursoService;
import com.example.colegio.service.EstudianteService;
import com.example.colegio.service.ProfesorService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ConsultaRestController {

	@Autowired ProfesorService profesorService;
	@Autowired CursoService cursoService;
	@Autowired ColegioService colegioService;
	@Autowired AsignaturaService asignaturaService;
	@Autowired EstudianteService estudianteService;
	@Autowired ConsultaService consultaService;
	
	@GetMapping(value="/obtenerDocentes")
	public ResponseEntity<List<ProfesorVo>> obtenerDocentes(){
		return ResponseEntity.status(HttpStatus.OK).body(profesorService.findAll());
	}
	
	@GetMapping(value="/obtenerCursos")
	public ResponseEntity<List<CursoVo>> obtenerCursos(){
		return ResponseEntity.status(HttpStatus.OK).body(cursoService.findAll());
	}
	
	@GetMapping(value="/obtenerColegios")
	public ResponseEntity<List<ColegioVo>> obtenerColegios(){
		return ResponseEntity.status(HttpStatus.OK).body(colegioService.findAll());
	}
	
	@GetMapping(value="/obtenerAsignaturas")
	public ResponseEntity<List<AsignaturaVo>> obtenerAsignaturas(){
		return ResponseEntity.status(HttpStatus.OK).body(asignaturaService.findAll());
	}
	
	@GetMapping(value="/obtenerEstudiantes")
	public ResponseEntity<List<EstudianteVo>> obtenerEstudiantes(){
		return ResponseEntity.status(HttpStatus.OK).body(estudianteService.findAll());
	}
	
	@GetMapping(value="/ConsultaAsignaturas")
	public ResponseEntity<List<ConsultaAsignaturasVo>> consultaAsignaturas(@RequestParam Integer id){
		return ResponseEntity.status(HttpStatus.OK).body(consultaService.find(id));
	}
}

package com.example.colegio.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.colegio.service.IConsultaAsignaturas;
import com.example.colegio.vo.ConsultaAsignaturasVo;
import com.example.colegio.vo.ProfesorVo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Api(value = "Clase para consultar la BD del colegio")
public class ConsultaDataColegioController {
	
	@Autowired
	private IConsultaAsignaturas consultaServices;
	
	private final Logger logger = LoggerFactory.getLogger(ConsultaDataColegioController.class);
	
	@GetMapping("/obtenerDocentes")
	@ApiOperation(value = "Metodo de obtener docentes", notes = "metodo para consultar todos lso profesores")
	public ResponseEntity<?> obtenerProfesores() {
		Map<String, Object> responseError = new HashMap<>();
		HttpHeaders responseHeaders = new HttpHeaders();
		List<ProfesorVo> ListaProfesores;
		try {
			logger.info("Entro a: " + Thread.currentThread().getStackTrace()[1].getMethodName());
			ListaProfesores = consultaServices.listaProfesores();
			return ResponseEntity.ok().headers(responseHeaders).body(ListaProfesores);
		} catch (Exception e) {
			logger.error("Exception (" + Thread.currentThread().getStackTrace()[1].getMethodName() + ") :"
					+ " causa: " + e.getCause() + " mensaje: " + e.getMessage());
			responseError.put("mensaje: ", e.getMessage());
			return new ResponseEntity<Map<String, Object>>(responseError, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/consultarAsignaturas")
	@ApiOperation(value = "Metodo de obtener las asignaturas, cursos y estudiantes que tenga un docente")
	public ResponseEntity<?> obtenerAsignaturas(@RequestParam Integer idProfesor) {
		Map<String, Object> responseError = new HashMap<>();
		HttpHeaders responseHeaders = new HttpHeaders();
		List<ConsultaAsignaturasVo> list; 
		try {
			logger.info("Entro a: " + Thread.currentThread().getStackTrace()[1].getMethodName());
			list = consultaServices.listaAsignaturas(idProfesor);
			return ResponseEntity.ok().headers(responseHeaders).body(list);
		} catch (Exception e) {
			logger.error("Exception (" + Thread.currentThread().getStackTrace()[1].getMethodName() + ") :"
					+ " causa: " + e.getCause() + " mensaje: " + e.getMessage());
			responseError.put("mensaje: ", e.getMessage());
			return new ResponseEntity<Map<String, Object>>(responseError, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}

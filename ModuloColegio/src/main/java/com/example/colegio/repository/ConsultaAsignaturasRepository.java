package com.example.colegio.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.colegio.vo.ConsultaAsignaturasVo;
import com.example.colegio.vo.ProfesorVo;

@Repository
public class ConsultaAsignaturasRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String SQL_CONSULTA_DOCENTES = "select * from PROFESOR ";
	private static final String SQLCONSULTA_ASIGNATURAS = "select \r\n" + 
			"         e.IDESTUDIANTE , e.NOMBRE as nombreEstudiante , a.IDASIGNATURA , a.NOMBRE as nombreAsignatura , c.IDCURSO , concat(c.GRADO,c.SALON) as nombreCurso, p.IDPROFESOR, p.NOMBRE as nombreProfesor \r\n" + 
			"from  ESTUDIANTE e left join ESTUDIANTE_ASIGNATURA ea on (e.IDESTUDIANTE = ea.FK_IDESTUDIANTE )\r\n" + 
			"                                                inner join ASIGNATURA a on (a.IDASIGNATURA = ea.FK_IDASIGNATURA )                                                 \r\n" + 
			"                                                inner join CURSO c on (a.FK_IDCURSO = c.IDCURSO )\r\n" + 
			"                                                inner join PROFESOR p on (a.FK_IDPROFESOR  = p.IDPROFESOR )\r\n" + 
			" where p.IDPROFESOR   = ?;";
	
	public List<ProfesorVo> obtenerProfesores(){
		return jdbcTemplate.query(SQL_CONSULTA_DOCENTES, new Object[] {},
				(res, rowNum) -> {
					ProfesorVo profesorVo = new ProfesorVo();
					profesorVo.setId(res.getInt("IDPROFESOR"));
					profesorVo.setNombre(res.getString("NOMBRE"));
					return profesorVo;
				}
		);
	}
	
	public List<ConsultaAsignaturasVo> obtenerAsignaturas(Integer id){
		return jdbcTemplate.query(SQLCONSULTA_ASIGNATURAS, new Object[] {id},
				(res, rowNum) -> {
					ConsultaAsignaturasVo asignaturaVo = new ConsultaAsignaturasVo();
					asignaturaVo.setIdEstudiante(res.getInt("IDESTUDIANTE"));
					asignaturaVo.setNombreEstudiante(res.getString("NOMBREESTUDIANTE"));
					asignaturaVo.setIdAsignatura(res.getInt("IDASIGNATURA"));
					asignaturaVo.setNombreAsignatura(res.getString("NOMBREASIGNATURA"));
					asignaturaVo.setIdCurso(res.getInt("IDCURSO"));
					asignaturaVo.setNombreCurso(res.getString("NOMBRECURSO"));
					asignaturaVo.setIdProfesor(res.getInt("IDPROFESOR"));
					asignaturaVo.setNombreProfesor(res.getString("NOMBREPROFESOR"));
					return asignaturaVo;
				}
		);
	}
}

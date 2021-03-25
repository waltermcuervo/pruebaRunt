package com.example.colegio.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.colegio.domain.ConsultaAsignaturasVo;

@Repository
public class ConsultaAsignaturasRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String SQLCONSULTA_ASIGNATURAS = "select  \r\n" + 
			"    e.ID_ESTUDIANTE , e.NOMBRE as nombreEstudiante , a.ID_ASIGNATURA , a.NOMBRE as nombreAsignatura , c.ID_CURSO , concat(c.GRADO,c.SALON) as nombreCurso, p.ID_PROFESOR , p.NOMBRE as nombreProfesor \r\n" + 
			"	from  ESTUDIANTE e left join ESTUDIANTE_ASIGNATURAS ea on (e.ID_ESTUDIANTE = ea.ESTUDIANTE_VO_ID_ESTUDIANTE )\r\n" + 
			"    inner join ASIGNATURA a on (a.ID_ASIGNATURA = ea.ASIGNATURAS_ID_ASIGNATURA )                                                 \r\n" + 
			"    inner join CURSO c on (a.FK_ID_CURSO = c.ID_CURSO )\r\n" + 
			"    inner join PROFESOR p on (a.FK_ID_PROFESOR = p.ID_PROFESOR )\r\n" + 
			"	where p.ID_PROFESOR = ?";

	
	public List<ConsultaAsignaturasVo> obtenerAsignaturas(Integer id){
		return jdbcTemplate.query(SQLCONSULTA_ASIGNATURAS, new Object[] {id},
				(res, rowNum) -> {
					ConsultaAsignaturasVo asignaturaVo = new ConsultaAsignaturasVo();
					asignaturaVo.setIdEstudiante(res.getInt("ID_ESTUDIANTE"));
					asignaturaVo.setNombreEstudiante(res.getString("NOMBREESTUDIANTE"));
					asignaturaVo.setIdAsignatura(res.getInt("ID_ASIGNATURA"));
					asignaturaVo.setNombreAsignatura(res.getString("NOMBREASIGNATURA"));
					asignaturaVo.setIdCurso(res.getInt("ID_CURSO"));
					asignaturaVo.setNombreCurso(res.getString("NOMBRECURSO"));
					asignaturaVo.setIdProfesor(res.getInt("ID_PROFESOR"));
					asignaturaVo.setNombreProfesor(res.getString("NOMBREPROFESOR"));
					return asignaturaVo;
				}
		);
	}
}

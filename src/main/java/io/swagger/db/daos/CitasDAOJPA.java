package io.swagger.db.daos;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import io.swagger.db.models.CitaDTO;


@Repository 
public interface CitasDAOJPA extends CrudRepository<CitaDTO, Integer>{

	@Query(value = "select * from XLA_HISTORIAL_EXAMENES where xla_medico=:id_medico and fecha_cita>=current_date", nativeQuery = true)
	List<CitaDTO> findCitasFuturasDeMedico(@Param("id_medico")int id_medico);

	@Query(value = "select * from XLA_HISTORIAL_EXAMENES where xla_medico=:id_medico and fecha_cita>=:fecha_inicio and fecha_cita<=:fecha_fin;", nativeQuery = true)
	List<CitaDTO> findCitasMedicoPorFechas(@Param("id_medico")int id_medico,@Param("fecha_inicio")String fecha_inicio,@Param("fecha_fin")String fecha_fin);
	
	@Query(value = "select * from XLA_HISTORIAL_EXAMENES where xla_medico=:id_medico", nativeQuery = true)
	List<CitaDTO> findCitasMedico(@Param("id_medico")int id_medico);
	
	@Query(value = "select agregarNuevaCita(TO_DATE('07-07-2021', 'dd/mm/yyyy'),1,1,1,1,'7000',1) from dual", nativeQuery = true)
	int agregar_generico();
	
	@Query(value = "call agregarNuevaCitaSinRetorno('15-07-2021',1,1,1,1,'7000',1)", nativeQuery = true)
	void agregar_genericoSinRetorno();

	@Query(value = "select agregarNuevaCita(TO_DATE(:fecha, 'dd/mm/yyyy hh24:mi'),:medico,:cubiculo"
			+ ",:cliente,:examen,:costo,:id_usuario) from dual", nativeQuery = true)
	int agregar_Cita(@Param("fecha") String fecha,
			@Param("medico") int medico,
			@Param("cubiculo") int cubiculo,
			@Param("cliente") long cliente,
			@Param("examen") int examen,
			@Param("costo") String costo,
			@Param("id_usuario") int id_usuario);
	
}

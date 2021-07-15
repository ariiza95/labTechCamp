package io.swagger.db.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import io.swagger.db.models.ClienteDTO;
import io.swagger.db.models.ExamenDTO;


@Repository 
public interface ExamenesDAOJPA extends JpaRepository<ExamenDTO, Integer>{

	@Query(value = "Select xla_examenes.* from XLA_EXAMENES inner join XLA_COBERTURAS on XLA_EXAMENES.id_examen=XLA_COBERTURAS.xla_examen "
			+ "and XLA_COBERTURAS.xla_planes_salud=:id_plan", nativeQuery = true)
	List<ExamenDTO> findExamenesByPlan(@Param("id_plan")int id_plan);
	
	@Query(value = "select * from XLA_EXAMENES where xla_examenes.id_examen not in (Select xla_examenes.id_examen from XLA_EXAMENES inner "
			+ "join XLA_COBERTURAS on XLA_EXAMENES.id_examen=XLA_COBERTURAS.xla_examen and XLA_COBERTURAS.xla_planes_salud=:id_plan)", nativeQuery = true)
	List<ExamenDTO> findExamenesNoRegistradosByPlan(@Param("id_plan")int id_plan);

}

package io.swagger.db.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import io.swagger.db.models.ClienteDTO;
import io.swagger.db.models.CoberturaDTO;
import io.swagger.db.models.CubiculoDTO;


@Repository 
public interface CoberturasDAOJPA extends JpaRepository<CoberturaDTO, Integer>{

	@Query(value = "SELECT * from XLA_COBERTURAS where xla_planes_salud=:id_plan and visibilidad=1", nativeQuery = true)
	List<CoberturaDTO> findByPlan(@Param("id_plan")int id_plan);
	

}

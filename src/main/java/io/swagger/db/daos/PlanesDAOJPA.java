package io.swagger.db.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import io.swagger.db.models.ClienteDTO;
import io.swagger.db.models.PlanDTO;


@Repository 
public interface PlanesDAOJPA extends JpaRepository<PlanDTO, Integer>{

	@Query(value = "SELECT * from XLA_PLANES_SALUD where xla_empresa_prestadora=:id_empresa", nativeQuery = true)
	List<PlanDTO> findByEmpresa(@Param("id_empresa")int id_empresa);

}

package io.swagger.db.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import io.swagger.db.models.ClienteDTO;
import io.swagger.db.models.CubiculoDTO;


@Repository 
public interface CubiculosDAOJPA extends JpaRepository<CubiculoDTO, Integer>{

	@Query(value = "SELECT * from XLA_CUBICULOS where xla_tipo_examen=:id_examen", nativeQuery = true)
	List<CubiculoDTO> findByExamen(@Param("id_examen")int id_examen);
	

}

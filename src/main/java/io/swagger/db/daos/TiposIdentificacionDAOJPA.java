package io.swagger.db.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.swagger.db.models.Tipo_identificacionDTO;


@Repository 
public interface TiposIdentificacionDAOJPA extends JpaRepository<Tipo_identificacionDTO, Integer>{

	

}

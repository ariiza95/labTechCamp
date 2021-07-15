package io.swagger.db.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import io.swagger.db.models.Tipo_planDTO;


@Repository 
public interface TiposDePlanesDAOJPA extends JpaRepository<Tipo_planDTO, Integer>{

	

}

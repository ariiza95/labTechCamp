package io.swagger.db.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import io.swagger.db.models.Tipo_examenDTO;


@Repository 
public interface TipoExamenesDAOJPA extends JpaRepository<Tipo_examenDTO, Integer>{

	

}

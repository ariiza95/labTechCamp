package io.swagger.db.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import io.swagger.db.models.ClienteDTO;
import io.swagger.db.models.ExamenDTO;
import io.swagger.db.models.MedicoDTO;
import io.swagger.model.CitaMedico;


@Repository 
public interface MedicosDAOJPA extends JpaRepository<MedicoDTO, Integer>{

	

	
}

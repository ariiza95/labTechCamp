package io.swagger.db.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.swagger.db.models.EmpresaDTO;


@Repository 
public interface EmpresasDAOJPA extends JpaRepository<EmpresaDTO, Integer>{

	

}

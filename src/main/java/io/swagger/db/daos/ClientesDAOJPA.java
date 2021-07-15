package io.swagger.db.daos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import io.swagger.db.models.ClienteDTO;
import io.swagger.model.TipoIdentificacion;


@Repository 
public interface ClientesDAOJPA extends JpaRepository<ClienteDTO, Long>{

	//@Query(value = "SELECT c.* FROM contratista c WHERE NOT EXISTS (SELECT * FROM turno_contratista t  WHERE t.k_documento = c.k_documento )", nativeQuery = true)
	@Query(value = "SELECT * from XLA_TIPO_DOCUMENTO", nativeQuery = true)
	public List<TipoIdentificacion> consultarTodosLosTiposDeIdentificacion();
	
	@Query(value = "SELECT * from XLA_CLIENTES where numero_documento=:num_documento and tipo_documento=:tipo_doc", nativeQuery = true)
	ClienteDTO findByDocumento(@Param("num_documento")String numero_documento,@Param("tipo_doc")int tipo_documento);
	

}

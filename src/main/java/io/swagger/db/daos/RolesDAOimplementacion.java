package io.swagger.db.daos;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import io.swagger.db.mappers.RolMapperImplementacion;
import io.swagger.db.models.RolDTO;

@Repository
public class RolesDAOimplementacion  implements RolDAOJDBC{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Override
	public RolDTO solicitarRol(int id_rol) {
		StringBuilder sqlSentencia = new StringBuilder(100);
		sqlSentencia.append("SELECT * FROM XLA_ROLES where ID_ROL="+id_rol);		
		List<RolDTO> rolesEncontrados=jdbcTemplate.query(sqlSentencia.toString(), new RolMapperImplementacion());
		if(rolesEncontrados.size()==1) {
			return rolesEncontrados.get(0);
		}else {
			return null;
		}
	}


	


}

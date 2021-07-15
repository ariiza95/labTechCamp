package io.swagger.db.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import io.swagger.db.models.RolDTO;
import io.swagger.db.models.UsuarioDTO;


public class RolMapperImplementacion implements RowMapper<RolDTO> {

	@Override
	public RolDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		RolDTO rol=new RolDTO();
		rol.setId_rol(rs.getInt("id_rol"));
		rol.setNombre_rol(rs.getString("nombre_rol"));
		rol.setNivel_privilegio(rs.getInt("nivel_privilegio"));
		rol.setVisibilidad(rs.getInt("visibilidad"));
		
		return rol;
	}


	

}



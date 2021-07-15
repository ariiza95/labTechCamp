package io.swagger.db.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import io.swagger.db.models.UsuarioDTO;


public class UsuarioMapperImplementacion implements RowMapper<UsuarioDTO> {

	@Override
	public UsuarioDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		UsuarioDTO usuario=new UsuarioDTO();
		usuario.setId_usuario(rs.getInt("id_usuario"));
		usuario.setNombre_usuario(rs.getString("nombre_usuario"));
		usuario.setContraseña(rs.getString("contraseña"));
		usuario.setXla_rol(rs.getInt("xla_rol"));
		usuario.setVisibilidad(rs.getInt("visibilidad"));		
		return usuario;
	}


	

}



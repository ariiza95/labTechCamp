package io.swagger.db.daos;

import java.util.List;

import io.swagger.db.models.UsuarioDTO;


public interface LoginDAOJDBC {
	
	public UsuarioDTO solicitarUsuario(String nombre_usuario);
	
	
	

}

package io.swagger.db.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import io.swagger.db.mappers.UsuarioMapperImplementacion;
import io.swagger.db.models.UsuarioDTO;

@Repository
public class LoginDAOimplementacion  implements LoginDAOJDBC{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public UsuarioDTO solicitarUsuario(String nombre_usuario) {
		StringBuilder sqlSentencia = new StringBuilder(100);
		sqlSentencia.append("SELECT * FROM XLA_USUARIO_SISTEMA where nombre_usuario='"+nombre_usuario+"'");		
		List<UsuarioDTO> usuariosEncontrados=jdbcTemplate.query(sqlSentencia.toString(), new UsuarioMapperImplementacion());
		if(usuariosEncontrados.size()==1) {
			return usuariosEncontrados.get(0);
		}else {
			return null;
		}
	}


	


}

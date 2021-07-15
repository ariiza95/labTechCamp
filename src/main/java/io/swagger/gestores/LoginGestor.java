package io.swagger.gestores;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.db.daos.ClientesDAOJPA;
import io.swagger.db.daos.EmpresasDAOJPA;
import io.swagger.db.daos.LoginDAOimplementacion;
import io.swagger.db.daos.PlanesDAOJPA;
import io.swagger.db.daos.RolesDAOimplementacion;
import io.swagger.db.daos.TiposDePlanesDAOJPA;
import io.swagger.db.daos.TiposIdentificacionDAOJPA;
import io.swagger.db.models.ClienteDTO;
import io.swagger.db.models.EmpresaDTO;
import io.swagger.db.models.PlanDTO;
import io.swagger.db.models.RolDTO;
import io.swagger.db.models.Tipo_identificacionDTO;
import io.swagger.db.models.Tipo_planDTO;
import io.swagger.db.models.UsuarioDTO;
import io.swagger.model.Cliente;
import io.swagger.model.Fabrica_objetos_swagger;
import io.swagger.model.TipoIdentificacion;
import io.swagger.model.Usuario;
import io.swagger.model.UsuarioActivo;


@Service
@Transactional
public class LoginGestor{

	@Autowired
	LoginDAOimplementacion logindao;
	@Autowired
	RolesDAOimplementacion rolesdao;
	@Autowired
	Fabrica_objetos_swagger fabrica_retornos;
		
	
	public UsuarioActivo comprobarUsuario(Usuario usuario) {
		UsuarioDTO usuariodto=logindao.solicitarUsuario(usuario.getNombreUsuario());
		
		if(usuariodto!=null) {
			if(usuariodto.getContraseña().equals(usuario.getContrasea())){	
				RolDTO roldto=rolesdao.solicitarRol(usuariodto.getXla_rol());								
				return fabrica_retornos.crearUsuarioActivoRetorno(usuariodto, roldto);
			}else {
				return null;
			}
		}else {
			return null;
		}
		
		
	}
	
}

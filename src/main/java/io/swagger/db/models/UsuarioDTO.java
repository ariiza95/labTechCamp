package io.swagger.db.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="XLA_USUARIO_SISTEMA")
public class UsuarioDTO {
	
	@Id
	@GeneratedValue
	private int id_usuario;
	private String nombre_usuario;
	private String contrase�a;
	private int xla_rol;
	private int visibilidad;
	
	public UsuarioDTO(int id_usuario, String nombre_usuario, String contrase�a, int xla_rol, int visibilidad) {
		super();
		this.id_usuario = id_usuario;
		this.nombre_usuario = nombre_usuario;
		this.contrase�a = contrase�a;
		this.xla_rol = xla_rol;
		this.visibilidad = visibilidad;
	}
	
	

	public UsuarioDTO() {
		super();		
	}



	public int getId_usuario() {
		return id_usuario;
	}



	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}



	public String getNombre_usuario() {
		return nombre_usuario;
	}



	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}



	public String getContrase�a() {
		return contrase�a;
	}



	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}



	public int getXla_rol() {
		return xla_rol;
	}



	public void setXla_rol(int xla_rol) {
		this.xla_rol = xla_rol;
	}



	public int getVisibilidad() {
		return visibilidad;
	}



	public void setVisibilidad(int visibilidad) {
		this.visibilidad = visibilidad;
	}
	
	

	
	
	
}

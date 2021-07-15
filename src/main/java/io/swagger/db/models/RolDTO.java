package io.swagger.db.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="XLA_ROLES")
public class RolDTO {

	@Id
	@GeneratedValue
	private int id_rol;
	private String nombre_rol;
	private int nivel_privilegio;
	private int visibilidad;
	public RolDTO(int id_rol, String nombre_rol, int nivel_privilegio, int visibilidad) {
		super();
		this.id_rol = id_rol;
		this.nombre_rol = nombre_rol;
		this.nivel_privilegio = nivel_privilegio;
		this.visibilidad = visibilidad;
	}
	public RolDTO() {
		
	}
	public int getId_rol() {
		return id_rol;
	}
	public void setId_rol(int id_rol) {
		this.id_rol = id_rol;
	}
	public String getNombre_rol() {
		return nombre_rol;
	}
	public void setNombre_rol(String nombre_rol) {
		this.nombre_rol = nombre_rol;
	}
	public int getNivel_privilegio() {
		return nivel_privilegio;
	}
	public void setNivel_privilegio(int nivel_privilegio) {
		this.nivel_privilegio = nivel_privilegio;
	}
	public int getVisibilidad() {
		return visibilidad;
	}
	public void setVisibilidad(int visibilidad) {
		this.visibilidad = visibilidad;
	}
	
	
}

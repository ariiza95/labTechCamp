package io.swagger.db.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="XLA_TIPO_DOCUMENTO")
public class Tipo_identificacionDTO {
	
	@Id
	@GeneratedValue
	private int id_documento;
	private String nombre_tipo_documento;
	public Tipo_identificacionDTO(int id_tipo_identificacion, String nombre_tipo_identificacion) {
		super();
		this.id_documento = id_tipo_identificacion;
		this.nombre_tipo_documento = nombre_tipo_identificacion;
	}
	public Tipo_identificacionDTO() {
		
	}
	public int getId_tipo_identificacion() {
		return id_documento;
	}
	public void setId_tipo_identificacion(int id_tipo_identificacion) {
		this.id_documento = id_tipo_identificacion;
	}
	public String getNombre_tipo_identificacion() {
		return nombre_tipo_documento;
	}
	public void setNombre_tipo_identificacion(String nombre_tipo_identificacion) {
		this.nombre_tipo_documento = nombre_tipo_identificacion;
	}
	
	

}

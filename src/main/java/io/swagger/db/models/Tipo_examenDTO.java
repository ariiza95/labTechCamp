package io.swagger.db.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="XLA_TIPOS_EXAMEN")
public class Tipo_examenDTO {

	@Id
	@GeneratedValue
	private int id_tipo_examen;
	private String nombre_tipo_examen;
	private boolean visibilidad;
	
		
	public Tipo_examenDTO(int id_tipo_examen, String nombre_tipo_examen, boolean disponibilidad) {
		super();
		this.id_tipo_examen = id_tipo_examen;
		this.nombre_tipo_examen = nombre_tipo_examen;
		this.visibilidad = disponibilidad;
	}
	
	
	
	public Tipo_examenDTO() {
		super();
	}



	public int getId_tipo_examen() {
		
		return id_tipo_examen;
	}
	public void setId_tipo_examen(int id_tipo_examen) {
		this.id_tipo_examen = id_tipo_examen;
	}
	public String getNombre_tipo_examen() {
		return nombre_tipo_examen;
	}
	public void setNombre_tipo_examen(String nombre_tipo_examen) {
		this.nombre_tipo_examen = nombre_tipo_examen;
	}
	public boolean isVisibilidad() {
		return visibilidad;
	}
	public void setVisibilidad(boolean visibilidad) {
		this.visibilidad = visibilidad;
	}
	
	
	
}

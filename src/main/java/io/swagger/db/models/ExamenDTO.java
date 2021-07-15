package io.swagger.db.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="XLA_EXAMENES")
public class ExamenDTO {

	@Id
	@GeneratedValue
	private int id_Examen;
	private String nombre_examen;
	private int xla_tipo_examen;
	
	
	public ExamenDTO(int id_Examen, String nombre_examen, int id_tipo_examen) {
		super();
		this.id_Examen = id_Examen;
		this.nombre_examen = nombre_examen;
		this.xla_tipo_examen = id_tipo_examen;
	}
	public ExamenDTO() {
		
	}


	public int getId_Examen() {
		return id_Examen;
	}


	public void setId_Examen(int id_Examen) {
		this.id_Examen = id_Examen;
	}


	public String getNombre_examen() {
		return nombre_examen;
	}


	public void setNombre_examen(String nombre_examen) {
		this.nombre_examen = nombre_examen;
	}


	public int getId_tipo_examen() {
		return xla_tipo_examen;
	}


	public void setId_tipo_examen(int id_tipo_examen) {
		this.xla_tipo_examen = id_tipo_examen;
	}
	
	
	
}

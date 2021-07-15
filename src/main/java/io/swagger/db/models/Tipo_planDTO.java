package io.swagger.db.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="XLA_TIPOS_PLAN")
public class Tipo_planDTO {
	
	@Id
	@GeneratedValue
	private int id_tipo_plan;
	private String nombre_tipo_plan;
	public int getId_tipo_plan() {
		return id_tipo_plan;
	}
	public void setId_tipo_plan(int id_tipo_plan) {
		this.id_tipo_plan = id_tipo_plan;
	}
	public String getNombre_tipo_plan() {
		return nombre_tipo_plan;
	}
	public void setNombre_tipo_plan(String nombre_tipo_plan) {
		this.nombre_tipo_plan = nombre_tipo_plan;
	}
	public Tipo_planDTO(int id_tipo_plan, String nombre_tipo_plan) {
		super();
		this.id_tipo_plan = id_tipo_plan;
		this.nombre_tipo_plan = nombre_tipo_plan;
	}
	
	public Tipo_planDTO() {
		
	}

}

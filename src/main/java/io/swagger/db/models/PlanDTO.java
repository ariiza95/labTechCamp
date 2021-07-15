package io.swagger.db.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="XLA_PLANES_SALUD")
public class PlanDTO {


	@Id
	@GeneratedValue
	private int id_plan;
	private String nombre_plan;
	private int tipo_plan;
	private int xla_empresa_prestadora;
	
	
	public int getId_plan() {
		return id_plan;
	}
	public void setId_plan(int id_plan) {
		this.id_plan = id_plan;
	}
	public String getNombre_plan() {
		return nombre_plan;
	}
	public void setNombre_plan(String nombre_plan) {
		this.nombre_plan = nombre_plan;
	}


	public int getId_tipo_plan() {
		return tipo_plan;
	}
	public void setId_tipo_plan(int id_tipo_plan) {
		this.tipo_plan = id_tipo_plan;
	}
	public int getId_empresa_prestadora() {
		return xla_empresa_prestadora;
	}
	public void setId_empresa_prestadora(int id_empresa_prestadora) {
		this.xla_empresa_prestadora = id_empresa_prestadora;
	}
	public PlanDTO(int id_plan, String nombre_plan, int id_tipo_plan, int id_empresa_prestadora) {
		super();
		this.id_plan = id_plan;
		this.nombre_plan = nombre_plan;
		this.tipo_plan = id_tipo_plan;
		this.xla_empresa_prestadora = id_empresa_prestadora;
	}

	public PlanDTO() {
		
	}
	
	
	
}

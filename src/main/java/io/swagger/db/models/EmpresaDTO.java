package io.swagger.db.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="XLA_EMPRESAS_PRESTADORAS")
public class EmpresaDTO {

	@Id
	@GeneratedValue
	private int id_empresa;
	private String nombre_empresa;
	public int getId_empresa() {
		return id_empresa;
	}
	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}
	public String getNombre_empresa() {
		return nombre_empresa;
	}
	public void setNombre_empresa(String nombre_empresa) {
		this.nombre_empresa = nombre_empresa;
	}
	public EmpresaDTO(int id_empresa, String nombre_empresa) {
		super();
		this.id_empresa = id_empresa;
		this.nombre_empresa = nombre_empresa;
	}
	public EmpresaDTO() {
		
	}
	
	
	
}

package io.swagger.db.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="XLA_CUBICULOS")
public class CubiculoDTO {

	@Id
	@GeneratedValue
	private int id_Cubiculo;
	private String numero_cubiculo;
	private String descripcion;
	private boolean disponibilidad;
	private int xla_tipo_examen;
	
	
	
	public int getId_Cubiculo() {
		return id_Cubiculo;
	}
	public void setId_Cubiculo(int id_Cubiculo) {
		this.id_Cubiculo = id_Cubiculo;
	}
	public String getNumero_cubiculo() {
		return numero_cubiculo;
	}
	public void setNumero_cubiculo(String numero_cubiculo) {
		this.numero_cubiculo = numero_cubiculo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public int getId_tipo_examen() {
		return xla_tipo_examen;
	}
	public void setId_tipo_examen(int id_tipo_examen) {
		this.xla_tipo_examen = id_tipo_examen;
	}
	public CubiculoDTO(int id_Cubiculo, String numero_cubiculo, String descripcion, boolean disponibilidad,
			int id_tipo_examen) {
		super();
		this.id_Cubiculo = id_Cubiculo;
		this.numero_cubiculo = numero_cubiculo;
		this.descripcion = descripcion;
		this.disponibilidad = disponibilidad;
		this.xla_tipo_examen = id_tipo_examen;
	}
	public CubiculoDTO() {
		
	}
	
	
}

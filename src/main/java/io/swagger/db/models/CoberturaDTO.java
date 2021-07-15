package io.swagger.db.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="XLA_COBERTURAS")
public class CoberturaDTO {

	@Id
	@GeneratedValue
	private int id_Cobertura;
	private int tiempo_respuesta;
	private String tarifa_cubierta;
	private int xla_examen;
	private boolean visibilidad;
	private int xla_planes_salud;
	
	
	public CoberturaDTO(int id_Cobertura, int tiempo_respuesta, String tarifa_cubierta, int xla_examen,
			boolean visibilidad, int xla_planes_salud) {
		super();
		this.id_Cobertura = id_Cobertura;
		this.tiempo_respuesta = tiempo_respuesta;
		this.tarifa_cubierta = tarifa_cubierta;
		this.xla_examen = xla_examen;
		this.visibilidad = visibilidad;
		this.xla_planes_salud = xla_planes_salud;
	}
	
	public int getId_Cobertura() {
		return id_Cobertura;
	}




	public void setId_Cobertura(int id_Cobertura) {
		this.id_Cobertura = id_Cobertura;
	}




	public int getTiempo_respuesta() {
		return tiempo_respuesta;
	}




	public void setTiempo_respuesta(int tiempo_respuesta) {
		this.tiempo_respuesta = tiempo_respuesta;
	}




	public String getTarifa_cubierta() {
		return tarifa_cubierta;
	}




	public void setTarifa_cubierta(String tarifa_cubierta) {
		this.tarifa_cubierta = tarifa_cubierta;
	}




	public int getXla_examen() {
		return xla_examen;
	}




	public void setXla_examen(int xla_examen) {
		this.xla_examen = xla_examen;
	}




	public boolean isVisibilidad() {
		return visibilidad;
	}




	public void setVisibilidad(boolean visibilidad) {
		this.visibilidad = visibilidad;
	}




	public int getXla_planes_salud() {
		return xla_planes_salud;
	}




	public void setXla_planes_salud(int xla_planes_salud) {
		this.xla_planes_salud = xla_planes_salud;
	}




	public CoberturaDTO() {
		
	}
	
	
}

package io.swagger.db.models;

import java.util.Date;
import javax.persistence.Entity;

import org.springframework.data.repository.query.Param;

import javax.persistence.*;

@Entity
@Table(name="XLA_HISTORIAL_EXAMENES")
public class CitaDTO {
	
	@Id
	@GeneratedValue
	private int id_historial;
	private Date fecha_cita;
	private int xla_medico;
	private long xla_cliente;
	private int xla_cubiculo;
	private int xla_examen;
	private String costo_cita;
	
	public int getId_historial() {
		return id_historial;
	}
	public void setId_historial(int id_historial) {
		this.id_historial = id_historial;
	}
	public Date getFecha_cita() {
		return fecha_cita;
	}
	public void setFecha_cita(Date fecha_cita) {
		this.fecha_cita = fecha_cita;
	}
	public int getId_medico() {
		return xla_medico;
	}
	public void setId_medico(int id_medico) {
		this.xla_medico = id_medico;
	}
	public long getId_cliente() {
		return xla_cliente;
	}
	public void setId_cliente(long id_cliente) {
		this.xla_cliente = id_cliente;
	}
	public int getId_cubiculo() {
		return xla_cubiculo;
	}
	public void setId_cubiculo(int id_cubiculo) {
		this.xla_cubiculo = id_cubiculo;
	}
	public int getId_examen() {
		return xla_examen;
	}
	public void setId_examen(int id_examen) {
		this.xla_examen = id_examen;
	}

	public CitaDTO(int id_historial, Date fecha_cita, int xla_medico, int xla_cliente, int xla_cubiculo,
			int xla_examen, String costo_cita) {
		super();
		this.id_historial = id_historial;
		this.fecha_cita = fecha_cita;
		this.xla_medico = xla_medico;
		this.xla_cliente = xla_cliente;
		this.xla_cubiculo = xla_cubiculo;
		this.xla_examen = xla_examen;
		this.costo_cita = costo_cita;
	}
	
	public String getCosto_cita() {
		return costo_cita;
	}
	public void setCosto_cita(String costo_cita) {
		this.costo_cita = costo_cita;
	}
	public CitaDTO() {
		
	}
	
	
	
	
}

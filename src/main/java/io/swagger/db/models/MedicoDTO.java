package io.swagger.db.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="XLA_MEDICOS")
public class MedicoDTO {

	
	@Id
	@GeneratedValue
	private int id_Medico;
	private String numero_documento;
	private String nombres;
	private String apellidos;
	private Date fecha_nacimiento;
	private String celular;
	private String tarjeta_profesional;
	private String direccion;	
	private int xla_tipo_documento;
	
	public MedicoDTO(int id_Medico, String numero_documento, String nombres, String apellidos, Date fecha_nacimiento,
			String celular, String tarjeta_profesional, String direccion, int id_tipo_documento) {
		super();
		this.id_Medico = id_Medico;
		this.numero_documento = numero_documento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fecha_nacimiento = fecha_nacimiento;
		this.celular = celular;
		this.tarjeta_profesional = tarjeta_profesional;
		this.direccion = direccion;
		this.xla_tipo_documento = id_tipo_documento;
	}
	public MedicoDTO() {
		
	}

	public int getId_Medico() {
		return id_Medico;
	}

	public void setId_Medico(int id_Medico) {
		this.id_Medico = id_Medico;
	}

	public String getNumero_documento() {
		return numero_documento;
	}

	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTarjeta_profesional() {
		return tarjeta_profesional;
	}

	public void setTarjeta_profesional(String tarjeta_profesional) {
		this.tarjeta_profesional = tarjeta_profesional;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getId_tipo_documento() {
		return xla_tipo_documento;
	}

	public void setId_tipo_documento(int id_tipo_documento) {
		this.xla_tipo_documento = id_tipo_documento;
	}
	
	
	
}

package io.swagger.db.models;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="XLA_CLIENTES")
public class ClienteDTO {
	
	@Id
	@GeneratedValue
	private long id_Cliente;
	private String nombres;
	private String apellidos;
	private Date fechaNacimiento;
	private String direccion;
	private String celular;
	private String correo;
	private String numero_documento;
	private int tipo_documento;
	private int plan_salud;
	public long getId_Ciente() {
		return id_Cliente;
	}
	public void setId_Ciente(long id_Cliente) {
		this.id_Cliente = id_Cliente;
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
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getNumero_documento() {
		return numero_documento;
	}
	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}
	public int getTipo_documento() {
		return tipo_documento;
	}
	public void setTipo_documento(int tipo_documento) {
		this.tipo_documento = tipo_documento;
	}
	public int getPlan_salud() {
		return plan_salud;
	}
	public void setPlan_salud(int plan_salud) {
		this.plan_salud = plan_salud;
	}
	public ClienteDTO(int id_Cliente, String nombres, String apellidos, Date fechaNacimiento, String direccion,
			String celular, String correo, String numero_documento, int tipo_documento, int plan_salud) {
		super();
		this.id_Cliente = id_Cliente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.celular = celular;
		this.correo = correo;
		this.numero_documento = numero_documento;
		this.tipo_documento = tipo_documento;
		this.plan_salud = plan_salud;
	}
	public ClienteDTO() {
		
	}
	
}

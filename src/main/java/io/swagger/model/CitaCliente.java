package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

/**
 * CitaCliente
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")


public class CitaCliente   {
	
	
	
  public CitaCliente() {
		super();
	}

public CitaCliente(String fecha, String hora, String cubiculo, String medico, String costo,String examen) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.cubiculo = cubiculo;
		this.medico = medico;
		this.costo = costo;
		this.examen = examen;
	}

@JsonProperty("fecha")
  private String fecha = null;

  @JsonProperty("hora")
  private String hora = null;

  @JsonProperty("cubiculo")
  private String cubiculo = null;

  @JsonProperty("medico")
  private String medico = null;

  @JsonProperty("costo")
  private String costo = null;
  
  @JsonProperty("examen")
  private String examen = null; 
  
  
  public String getExamen() {
	return examen;
}

public void setExamen(String examen) {
	this.examen = examen;
}



public CitaCliente fecha(String fecha) {
    this.fecha = fecha;
    return this;
  }
  
  

  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public CitaCliente hora(String hora) {
    this.hora = hora;
    return this;
  }


  public String getHora() {
    return hora;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }

  public CitaCliente cubiculo(String cubiculo) {
    this.cubiculo = cubiculo;
    return this;
  }



  public String getCubiculo() {
    return cubiculo;
  }

  public void setCubiculo(String cubiculo) {
    this.cubiculo = cubiculo;
  }

  public CitaCliente medico(String medico) {
    this.medico = medico;
    return this;
  }


  public String getMedico() {
    return medico;
  }

  public void setMedico(String medico) {
    this.medico = medico;
  }

  public CitaCliente costo(String costo) {
    this.costo = costo;
    return this;
  }


  public String getCosto() {
    return costo;
  }

  public void setCosto(String costo) {
    this.costo = costo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CitaCliente citaCliente = (CitaCliente) o;
    return Objects.equals(this.fecha, citaCliente.fecha) &&
        Objects.equals(this.hora, citaCliente.hora) &&
        Objects.equals(this.cubiculo, citaCliente.cubiculo) &&
        Objects.equals(this.medico, citaCliente.medico) &&
        Objects.equals(this.costo, citaCliente.costo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fecha, hora, cubiculo, medico, costo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CitaCliente {\n");
    
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    hora: ").append(toIndentedString(hora)).append("\n");
    sb.append("    cubiculo: ").append(toIndentedString(cubiculo)).append("\n");
    sb.append("    medico: ").append(toIndentedString(medico)).append("\n");
    sb.append("    costo: ").append(toIndentedString(costo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


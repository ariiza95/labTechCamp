package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

/**
 * CitaCubiculo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")




public class CitaCubiculo   {
  @JsonProperty("fecha")
  private String fecha = null;

  @JsonProperty("hora")
  private String hora = null;

  @JsonProperty("cubiculo")
  private String cubiculo = null;

  @JsonProperty("cliente")
  private String cliente = null;

  @JsonProperty("Celular")
  private String celular = null;
  
  @JsonProperty("examen")
  private String examen = null; 
  
  
  public String getExamen() {
	return examen;
}

public void setExamen(String examen) {
	this.examen = examen;
}



  public CitaCubiculo() {
	super();
}

public CitaCubiculo(String fecha, String hora, String cubiculo, String cliente, String celular,
		String examen) {
	super();
	this.fecha = fecha;
	this.hora = hora;
	this.cubiculo = cubiculo;
	this.cliente = cliente;
	this.celular = celular;
	this.examen = examen;
}

public CitaCubiculo fecha(String fecha) {
    this.fecha = fecha;
    return this;
  }


  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public CitaCubiculo hora(String hora) {
    this.hora = hora;
    return this;
  }




  public String getHora() {
    return hora;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }

  public CitaCubiculo cubiculo(String cubiculo) {
    this.cubiculo = cubiculo;
    return this;
  }



  public String getCubiculo() {
    return cubiculo;
  }

  public void setCubiculo(String cubiculo) {
    this.cubiculo = cubiculo;
  }

  public CitaCubiculo cliente(String cliente) {
    this.cliente = cliente;
    return this;
  }



  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }


  public CitaCubiculo celular(String celular) {
    this.celular = celular;
    return this;
  }


  public String getCelular() {
    return celular;
  }

  public void setCelular(String celular) {
    this.celular = celular;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CitaCubiculo citaCubiculo = (CitaCubiculo) o;
    return Objects.equals(this.fecha, citaCubiculo.fecha) &&
        Objects.equals(this.hora, citaCubiculo.hora) &&
        Objects.equals(this.cubiculo, citaCubiculo.cubiculo) &&
        Objects.equals(this.cliente, citaCubiculo.cliente) &&
        Objects.equals(this.celular, citaCubiculo.celular);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fecha, hora, cubiculo, cliente, celular);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CitaCubiculo {\n");
    
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    hora: ").append(toIndentedString(hora)).append("\n");
    sb.append("    cubiculo: ").append(toIndentedString(cubiculo)).append("\n");
    sb.append("    cliente: ").append(toIndentedString(cliente)).append("\n");
    sb.append("    celular: ").append(toIndentedString(celular)).append("\n");
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


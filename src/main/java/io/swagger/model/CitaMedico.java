package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * CitaMedico
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")


public class CitaMedico   {
  @JsonProperty("fecha")
  private String fecha = null;

  @JsonProperty("hora")
  private String hora = null;

  @JsonProperty("cubiculo")
  private String cubiculo = null;

  @JsonProperty("cliente")
  private String cliente = null;

  @JsonProperty("examen")
  private String examen = null;

  @JsonProperty("costo")
  private String costo = null;

  public CitaMedico fecha(String fecha) {
    this.fecha = fecha;
    return this;
  }




  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public CitaMedico hora(String hora) {
    this.hora = hora;
    return this;
  }



  public String getHora() {
    return hora;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }

  public CitaMedico cubiculo(String cubiculo) {
    this.cubiculo = cubiculo;
    return this;
  }



  public String getCubiculo() {
    return cubiculo;
  }

  public void setCubiculo(String cubiculo) {
    this.cubiculo = cubiculo;
  }

  public CitaMedico cliente(String cliente) {
    this.cliente = cliente;
    return this;
  }


  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public CitaMedico examen(String examen) {
    this.examen = examen;
    return this;
  }



  public String getExamen() {
    return examen;
  }

  public void setExamen(String examen) {
    this.examen = examen;
  }

  public CitaMedico costo(String costo) {
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
    CitaMedico citaMedico = (CitaMedico) o;
    return Objects.equals(this.fecha, citaMedico.fecha) &&
        Objects.equals(this.hora, citaMedico.hora) &&
        Objects.equals(this.cubiculo, citaMedico.cubiculo) &&
        Objects.equals(this.cliente, citaMedico.cliente) &&
        Objects.equals(this.examen, citaMedico.examen) &&
        Objects.equals(this.costo, citaMedico.costo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fecha, hora, cubiculo, cliente, examen, costo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CitaMedico {\n");
    
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    hora: ").append(toIndentedString(hora)).append("\n");
    sb.append("    cubiculo: ").append(toIndentedString(cubiculo)).append("\n");
    sb.append("    cliente: ").append(toIndentedString(cliente)).append("\n");
    sb.append("    examen: ").append(toIndentedString(examen)).append("\n");
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


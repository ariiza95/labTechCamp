package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Examen;
import org.springframework.validation.annotation.Validated;

/**
 * Cobertura
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")


public class Cobertura   {
  @JsonProperty("id_cobertura")
  private Integer idCobertura = null;

  @JsonProperty("tiempo_respuesta")
  private Integer tiempoRespuesta = null;

  @JsonProperty("tarifa")
  private String tarifa = null;

  @JsonProperty("examen")
  private Examen examen = null;

  public Cobertura idCobertura(Integer idCobertura) {
    this.idCobertura = idCobertura;
    return this;
  }



  public Integer getIdCobertura() {
    return idCobertura;
  }

  public void setIdCobertura(Integer idCobertura) {
    this.idCobertura = idCobertura;
  }

  public Cobertura tiempoRespuesta(Integer tiempoRespuesta) {
    this.tiempoRespuesta = tiempoRespuesta;
    return this;
  }

 


  public Integer getTiempoRespuesta() {
    return tiempoRespuesta;
  }

  public void setTiempoRespuesta(Integer tiempoRespuesta) {
    this.tiempoRespuesta = tiempoRespuesta;
  }

  public Cobertura tarifa(String tarifa) {
    this.tarifa = tarifa;
    return this;
  }



  public String getTarifa() {
    return tarifa;
  }

  public void setTarifa(String tarifa) {
    this.tarifa = tarifa;
  }

  public Cobertura examen(Examen examen) {
    this.examen = examen;
    return this;
  }


  public Examen getExamen() {
    return examen;
  }

  public void setExamen(Examen examen) {
    this.examen = examen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cobertura cobertura = (Cobertura) o;
    return Objects.equals(this.idCobertura, cobertura.idCobertura) &&
        Objects.equals(this.tiempoRespuesta, cobertura.tiempoRespuesta) &&
        Objects.equals(this.tarifa, cobertura.tarifa) &&
        Objects.equals(this.examen, cobertura.examen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCobertura, tiempoRespuesta, tarifa, examen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cobertura {\n");
    
    sb.append("    idCobertura: ").append(toIndentedString(idCobertura)).append("\n");
    sb.append("    tiempoRespuesta: ").append(toIndentedString(tiempoRespuesta)).append("\n");
    sb.append("    tarifa: ").append(toIndentedString(tarifa)).append("\n");
    sb.append("    examen: ").append(toIndentedString(examen)).append("\n");
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


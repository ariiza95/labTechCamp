package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * Cubiculo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")


public class Cubiculo   {
  @JsonProperty("id_cubiculo")
  private Integer idCubiculo = null;

  @JsonProperty("numero_cubiculo")
  private String numeroCubiculo = null;

  @JsonProperty("descripcion")
  private String descripcion = null;

  @JsonProperty("id_tipo_examen")
  private Integer idTipoExamen = null;

  @JsonProperty("nombre_tipo_examen")
  private String nombreTipoExamen = null;

  @JsonProperty("disponibilidad")
  private Boolean disponibilidad = null;

  public Cubiculo idCubiculo(Integer idCubiculo) {
    this.idCubiculo = idCubiculo;
    return this;
  }



  public Integer getIdCubiculo() {
    return idCubiculo;
  }

  public void setIdCubiculo(Integer idCubiculo) {
    this.idCubiculo = idCubiculo;
  }

  public Cubiculo numeroCubiculo(String numeroCubiculo) {
    this.numeroCubiculo = numeroCubiculo;
    return this;
  }


  public String getNumeroCubiculo() {
    return numeroCubiculo;
  }

  public void setNumeroCubiculo(String numeroCubiculo) {
    this.numeroCubiculo = numeroCubiculo;
  }

  public Cubiculo descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }


  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public Cubiculo idTipoExamen(Integer idTipoExamen) {
    this.idTipoExamen = idTipoExamen;
    return this;
  }



  public Integer getIdTipoExamen() {
    return idTipoExamen;
  }

  public void setIdTipoExamen(Integer idTipoExamen) {
    this.idTipoExamen = idTipoExamen;
  }

  public Cubiculo nombreTipoExamen(String nombreTipoExamen) {
    this.nombreTipoExamen = nombreTipoExamen;
    return this;
  }



  public String getNombreTipoExamen() {
    return nombreTipoExamen;
  }

  public void setNombreTipoExamen(String nombreTipoExamen) {
    this.nombreTipoExamen = nombreTipoExamen;
  }

  public Cubiculo disponibilidad(Boolean disponibilidad) {
    this.disponibilidad = disponibilidad;
    return this;
  }



  public Boolean isDisponibilidad() {
    return disponibilidad;
  }

  public void setDisponibilidad(Boolean disponibilidad) {
    this.disponibilidad = disponibilidad;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cubiculo cubiculo = (Cubiculo) o;
    return Objects.equals(this.idCubiculo, cubiculo.idCubiculo) &&
        Objects.equals(this.numeroCubiculo, cubiculo.numeroCubiculo) &&
        Objects.equals(this.descripcion, cubiculo.descripcion) &&
        Objects.equals(this.idTipoExamen, cubiculo.idTipoExamen) &&
        Objects.equals(this.nombreTipoExamen, cubiculo.nombreTipoExamen) &&
        Objects.equals(this.disponibilidad, cubiculo.disponibilidad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCubiculo, numeroCubiculo, descripcion, idTipoExamen, nombreTipoExamen, disponibilidad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cubiculo {\n");
    
    sb.append("    idCubiculo: ").append(toIndentedString(idCubiculo)).append("\n");
    sb.append("    numeroCubiculo: ").append(toIndentedString(numeroCubiculo)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
    sb.append("    idTipoExamen: ").append(toIndentedString(idTipoExamen)).append("\n");
    sb.append("    nombreTipoExamen: ").append(toIndentedString(nombreTipoExamen)).append("\n");
    sb.append("    disponibilidad: ").append(toIndentedString(disponibilidad)).append("\n");
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


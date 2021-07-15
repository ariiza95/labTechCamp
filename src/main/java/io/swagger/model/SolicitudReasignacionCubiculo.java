package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * SolicitudReasignacionCubiculo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")


public class SolicitudReasignacionCubiculo   {
  @JsonProperty("id_cubiculo")
  private String idCubiculo = null;

  @JsonProperty("razon")
  private String razon = null;

  @JsonProperty("id_usuario")
  private Integer idUsuario = null;

  public SolicitudReasignacionCubiculo idCubiculo(String idCubiculo) {
    this.idCubiculo = idCubiculo;
    return this;
  }

 


  public String getIdCubiculo() {
    return idCubiculo;
  }

  public void setIdCubiculo(String idCubiculo) {
    this.idCubiculo = idCubiculo;
  }

  public SolicitudReasignacionCubiculo razon(String razon) {
    this.razon = razon;
    return this;
  }



  public String getRazon() {
    return razon;
  }

  public void setRazon(String razon) {
    this.razon = razon;
  }

  public SolicitudReasignacionCubiculo idUsuario(Integer idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }




  public Integer getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(Integer idUsuario) {
    this.idUsuario = idUsuario;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolicitudReasignacionCubiculo solicitudReasignacionCubiculo = (SolicitudReasignacionCubiculo) o;
    return Objects.equals(this.idCubiculo, solicitudReasignacionCubiculo.idCubiculo) &&
        Objects.equals(this.razon, solicitudReasignacionCubiculo.razon) &&
        Objects.equals(this.idUsuario, solicitudReasignacionCubiculo.idUsuario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCubiculo, razon, idUsuario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolicitudReasignacionCubiculo {\n");
    
    sb.append("    idCubiculo: ").append(toIndentedString(idCubiculo)).append("\n");
    sb.append("    razon: ").append(toIndentedString(razon)).append("\n");
    sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
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


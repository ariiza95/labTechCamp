package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * SolicitudCita
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")


public class SolicitudCita   {
  @JsonProperty("id_examen")
  private Integer idExamen = null;

  @JsonProperty("id_cliente")
  private Integer idCliente = null; 

  @JsonProperty("id_usuario")
  private Integer idUsuario = null;

  public SolicitudCita idExamen(Integer idExamen) {
    this.idExamen = idExamen;
    return this;
  }



  public Integer getIdExamen() {
    return idExamen;
  }

  public void setIdExamen(Integer idExamen) {
    this.idExamen = idExamen;
  }

  public SolicitudCita numeroIdentificacion(Integer numeroIdentificacion) {
    this.idCliente = numeroIdentificacion;
    return this;
  }

  


  public Integer getNumeroIdentificacion() {
    return idCliente;
  }

  public void setNumeroIdentificacion(Integer idCliente) {
    this.idCliente = idCliente;
  }

  public SolicitudCita idUsuario(Integer idUsuario) {
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
    SolicitudCita solicitudCita = (SolicitudCita) o;
    return Objects.equals(this.idExamen, solicitudCita.idExamen) &&
        Objects.equals(this.idCliente, solicitudCita.idCliente) &&
        Objects.equals(this.idUsuario, solicitudCita.idUsuario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idExamen, idCliente, idUsuario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolicitudCita {\n");
    
    sb.append("    idExamen: ").append(toIndentedString(idExamen)).append("\n");
    sb.append("    numeroIdentificacion: ").append(toIndentedString(idCliente)).append("\n");
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


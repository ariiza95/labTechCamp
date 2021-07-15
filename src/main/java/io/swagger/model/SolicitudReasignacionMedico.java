package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * SolicitudReasignacionMedico
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")


public class SolicitudReasignacionMedico   {
  @JsonProperty("identificacion_medico_ausente")
  private String identificacionMedicoAusente = null;

  @JsonProperty("identificacion_medico_remplazo")
  private String identificacionMedicoRemplazo = null;

  @JsonProperty("razon")
  private String razon = null;

  @JsonProperty("id_usuario")
  private Integer idUsuario = null;

  public SolicitudReasignacionMedico identificacionMedicoAusente(String identificacionMedicoAusente) {
    this.identificacionMedicoAusente = identificacionMedicoAusente;
    return this;
  }

 
  public String getIdentificacionMedicoAusente() {
    return identificacionMedicoAusente;
  }

  public void setIdentificacionMedicoAusente(String identificacionMedicoAusente) {
    this.identificacionMedicoAusente = identificacionMedicoAusente;
  }

  public SolicitudReasignacionMedico identificacionMedicoRemplazo(String identificacionMedicoRemplazo) {
    this.identificacionMedicoRemplazo = identificacionMedicoRemplazo;
    return this;
  }


  public String getIdentificacionMedicoRemplazo() {
    return identificacionMedicoRemplazo;
  }

  public void setIdentificacionMedicoRemplazo(String identificacionMedicoRemplazo) {
    this.identificacionMedicoRemplazo = identificacionMedicoRemplazo;
  }

  public SolicitudReasignacionMedico razon(String razon) {
    this.razon = razon;
    return this;
  }


  public String getRazon() {
    return razon;
  }

  public void setRazon(String razon) {
    this.razon = razon;
  }

  public SolicitudReasignacionMedico idUsuario(Integer idUsuario) {
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
    SolicitudReasignacionMedico solicitudReasignacionMedico = (SolicitudReasignacionMedico) o;
    return Objects.equals(this.identificacionMedicoAusente, solicitudReasignacionMedico.identificacionMedicoAusente) &&
        Objects.equals(this.identificacionMedicoRemplazo, solicitudReasignacionMedico.identificacionMedicoRemplazo) &&
        Objects.equals(this.razon, solicitudReasignacionMedico.razon) &&
        Objects.equals(this.idUsuario, solicitudReasignacionMedico.idUsuario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificacionMedicoAusente, identificacionMedicoRemplazo, razon, idUsuario);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolicitudReasignacionMedico {\n");
    
    sb.append("    identificacionMedicoAusente: ").append(toIndentedString(identificacionMedicoAusente)).append("\n");
    sb.append("    identificacionMedicoRemplazo: ").append(toIndentedString(identificacionMedicoRemplazo)).append("\n");
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


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * SolicitudPlanNuevo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")


public class SolicitudPlanNuevo   {
  @JsonProperty("id_tipo_plan")
  private Integer idTipoPlan = null;

  @JsonProperty("nombre_nuevo_plan")
  private String nombreNuevoPlan = null;

  @JsonProperty("id_empresa_seleccionado")
  private Integer idEmpresaSeleccionado = null;

  public SolicitudPlanNuevo idTipoPlan(Integer idTipoPlan) {
    this.idTipoPlan = idTipoPlan;
    return this;
  }


  public Integer getIdTipoPlan() {
    return idTipoPlan;
  }

  public void setIdTipoPlan(Integer idTipoPlan) {
    this.idTipoPlan = idTipoPlan;
  }

  public SolicitudPlanNuevo nombreNuevoPlan(String nombreNuevoPlan) {
    this.nombreNuevoPlan = nombreNuevoPlan;
    return this;
  }




  public String getNombreNuevoPlan() {
    return nombreNuevoPlan;
  }

  public void setNombreNuevoPlan(String nombreNuevoPlan) {
    this.nombreNuevoPlan = nombreNuevoPlan;
  }

  public SolicitudPlanNuevo idEmpresaSeleccionado(Integer idEmpresaSeleccionado) {
    this.idEmpresaSeleccionado = idEmpresaSeleccionado;
    return this;
  }




  public Integer getIdEmpresaSeleccionado() {
    return idEmpresaSeleccionado;
  }

  public void setIdEmpresaSeleccionado(Integer idEmpresaSeleccionado) {
    this.idEmpresaSeleccionado = idEmpresaSeleccionado;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolicitudPlanNuevo solicitudPlanNuevo = (SolicitudPlanNuevo) o;
    return Objects.equals(this.idTipoPlan, solicitudPlanNuevo.idTipoPlan) &&
        Objects.equals(this.nombreNuevoPlan, solicitudPlanNuevo.nombreNuevoPlan) &&
        Objects.equals(this.idEmpresaSeleccionado, solicitudPlanNuevo.idEmpresaSeleccionado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTipoPlan, nombreNuevoPlan, idEmpresaSeleccionado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolicitudPlanNuevo {\n");
    
    sb.append("    idTipoPlan: ").append(toIndentedString(idTipoPlan)).append("\n");
    sb.append("    nombreNuevoPlan: ").append(toIndentedString(nombreNuevoPlan)).append("\n");
    sb.append("    idEmpresaSeleccionado: ").append(toIndentedString(idEmpresaSeleccionado)).append("\n");
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


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * TipoIdentificacion
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")


public class TipoIdentificacion   {
  @JsonProperty("id_tipo_identificacion")
  private Integer idTipoIdentificacion = null;

  @JsonProperty("nombre_tipo_identificacion")
  private String nombreTipoIdentificacion = null;

  public TipoIdentificacion idTipoIdentificacion(Integer idTipoIdentificacion) {
    this.idTipoIdentificacion = idTipoIdentificacion;
    return this;
  }

  



  public TipoIdentificacion(Integer idTipoIdentificacion, String nombreTipoIdentificacion) {
	super();
	this.idTipoIdentificacion = idTipoIdentificacion;
	this.nombreTipoIdentificacion = nombreTipoIdentificacion;
}





public Integer getIdTipoIdentificacion() {
    return idTipoIdentificacion;
  }

  public void setIdTipoIdentificacion(Integer idTipoIdentificacion) {
    this.idTipoIdentificacion = idTipoIdentificacion;
  }

  public TipoIdentificacion nombreTipoIdentificacion(String nombreTipoIdentificacion) {
    this.nombreTipoIdentificacion = nombreTipoIdentificacion;
    return this;
  }




  public String getNombreTipoIdentificacion() {
    return nombreTipoIdentificacion;
  }

  public void setNombreTipoIdentificacion(String nombreTipoIdentificacion) {
    this.nombreTipoIdentificacion = nombreTipoIdentificacion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoIdentificacion tipoIdentificacion = (TipoIdentificacion) o;
    return Objects.equals(this.idTipoIdentificacion, tipoIdentificacion.idTipoIdentificacion) &&
        Objects.equals(this.nombreTipoIdentificacion, tipoIdentificacion.nombreTipoIdentificacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTipoIdentificacion, nombreTipoIdentificacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoIdentificacion {\n");
    
    sb.append("    idTipoIdentificacion: ").append(toIndentedString(idTipoIdentificacion)).append("\n");
    sb.append("    nombreTipoIdentificacion: ").append(toIndentedString(nombreTipoIdentificacion)).append("\n");
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


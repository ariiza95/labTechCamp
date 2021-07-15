package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * TiposExamen
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")


public class TiposExamen   {
  @JsonProperty("id_tipo_examen")
  private Integer idTipoExamen = null;

  @JsonProperty("nombre_tipo_examen")
  private String nombreTipoExamen = null;

  public TiposExamen idTipoExamen(Integer idTipoExamen) {
    this.idTipoExamen = idTipoExamen;
    return this;
  }



  public Integer getIdTipoExamen() {
    return idTipoExamen;
  }

  public void setIdTipoExamen(Integer idTipoExamen) {
    this.idTipoExamen = idTipoExamen;
  }

  public TiposExamen nombreTipoExamen(String nombreTipoExamen) {
    this.nombreTipoExamen = nombreTipoExamen;
    return this;
  }




  public String getNombreTipoExamen() {
    return nombreTipoExamen;
  }

  public void setNombreTipoExamen(String nombreTipoExamen) {
    this.nombreTipoExamen = nombreTipoExamen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TiposExamen tiposExamen = (TiposExamen) o;
    return Objects.equals(this.idTipoExamen, tiposExamen.idTipoExamen) &&
        Objects.equals(this.nombreTipoExamen, tiposExamen.nombreTipoExamen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTipoExamen, nombreTipoExamen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TiposExamen {\n");
    
    sb.append("    idTipoExamen: ").append(toIndentedString(idTipoExamen)).append("\n");
    sb.append("    nombreTipoExamen: ").append(toIndentedString(nombreTipoExamen)).append("\n");
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


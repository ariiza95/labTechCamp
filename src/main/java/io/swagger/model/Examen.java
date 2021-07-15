package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.TiposExamen;
import org.springframework.validation.annotation.Validated;

/**
 * Examen
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")


public class Examen   {
  @JsonProperty("id_examen")
  private Integer idExamen = null;

  @JsonProperty("nombre_examen")
  private String nombreExamen = null;

  @JsonProperty("tipo_examen")
  private TiposExamen tipoExamen = null;

  public Examen idExamen(Integer idExamen) {
    this.idExamen = idExamen;
    return this;
  }



  public Integer getIdExamen() {
    return idExamen;
  }

  public void setIdExamen(Integer idExamen) {
    this.idExamen = idExamen;
  }

  public Examen nombreExamen(String nombreExamen) {
    this.nombreExamen = nombreExamen;
    return this;
  }


  public String getNombreExamen() {
    return nombreExamen;
  }

  public void setNombreExamen(String nombreExamen) {
    this.nombreExamen = nombreExamen;
  }

  public Examen tipoExamen(TiposExamen tipoExamen) {
    this.tipoExamen = tipoExamen;
    return this;
  }


  public TiposExamen getTipoExamen() {
    return tipoExamen;
  }

  public void setTipoExamen(TiposExamen tipoExamen) {
    this.tipoExamen = tipoExamen;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Examen examen = (Examen) o;
    return Objects.equals(this.idExamen, examen.idExamen) &&
        Objects.equals(this.nombreExamen, examen.nombreExamen) &&
        Objects.equals(this.tipoExamen, examen.tipoExamen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idExamen, nombreExamen, tipoExamen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Examen {\n");
    
    sb.append("    idExamen: ").append(toIndentedString(idExamen)).append("\n");
    sb.append("    nombreExamen: ").append(toIndentedString(nombreExamen)).append("\n");
    sb.append("    tipoExamen: ").append(toIndentedString(tipoExamen)).append("\n");
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


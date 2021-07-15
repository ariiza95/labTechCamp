package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * TipoPlan
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")


public class TipoPlan   {
  @JsonProperty("id_tipo_plan")
  private Integer idTipoPlan = null;

  @JsonProperty("nombre_tipo_plan")
  private String nombreTipoPlan = null;

  public TipoPlan idTipoPlan(Integer idTipoPlan) {
    this.idTipoPlan = idTipoPlan;
    return this;
  }



  public Integer getIdTipoPlan() {
    return idTipoPlan;
  }

  public void setIdTipoPlan(Integer idTipoPlan) {
    this.idTipoPlan = idTipoPlan;
  }

  public TipoPlan nombreTipoPlan(String nombreTipoPlan) {
    this.nombreTipoPlan = nombreTipoPlan;
    return this;
  }



  public String getNombreTipoPlan() {
    return nombreTipoPlan;
  }

  public void setNombreTipoPlan(String nombreTipoPlan) {
    this.nombreTipoPlan = nombreTipoPlan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TipoPlan tipoPlan = (TipoPlan) o;
    return Objects.equals(this.idTipoPlan, tipoPlan.idTipoPlan) &&
        Objects.equals(this.nombreTipoPlan, tipoPlan.nombreTipoPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTipoPlan, nombreTipoPlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoPlan {\n");
    
    sb.append("    idTipoPlan: ").append(toIndentedString(idTipoPlan)).append("\n");
    sb.append("    nombreTipoPlan: ").append(toIndentedString(nombreTipoPlan)).append("\n");
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


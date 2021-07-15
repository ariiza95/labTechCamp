package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * PlanCorto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")


public class PlanCorto   {
  @JsonProperty("id_plan")
  private Integer idPlan = null;

  @JsonProperty("nombre_plan")
  private String nombrePlan = null;

  public PlanCorto idPlan(Integer idPlan) {
    this.idPlan = idPlan;
    return this;
  }
  
  


  public PlanCorto(Integer idPlan, String nombrePlan) {
	super();
	this.idPlan = idPlan;
	this.nombrePlan = nombrePlan;
}




public PlanCorto() {
	super();
}




public Integer getIdPlan() {
    return idPlan;
  }

  public void setIdPlan(Integer idPlan) {
    this.idPlan = idPlan;
  }

  public PlanCorto nombrePlan(String nombrePlan) {
    this.nombrePlan = nombrePlan;
    return this;
  }


  public String getNombrePlan() {
    return nombrePlan;
  }

  public void setNombrePlan(String nombrePlan) {
    this.nombrePlan = nombrePlan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanCorto planCorto = (PlanCorto) o;
    return Objects.equals(this.idPlan, planCorto.idPlan) &&
        Objects.equals(this.nombrePlan, planCorto.nombrePlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPlan, nombrePlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanCorto {\n");
    
    sb.append("    idPlan: ").append(toIndentedString(idPlan)).append("\n");
    sb.append("    nombrePlan: ").append(toIndentedString(nombrePlan)).append("\n");
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


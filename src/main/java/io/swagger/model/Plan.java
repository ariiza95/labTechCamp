package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Cobertura;
import io.swagger.model.Empresa;
import io.swagger.model.TipoPlan;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;

/**
 * Plan
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")


public class Plan   {
  @JsonProperty("id_plan")
  private Integer idPlan = null;

  @JsonProperty("nombre_plan")
  private String nombrePlan = null;

  @JsonProperty("tipo_plan")
  private TipoPlan tipoPlan = null;

  @JsonProperty("empresa")
  private Empresa empresa = null;

  @JsonProperty("cobertura")
  private List<Cobertura> cobertura = null;

  public Plan idPlan(Integer idPlan) {
    this.idPlan = idPlan;
    return this;
  }


  public Integer getIdPlan() {
    return idPlan;
  }

  public void setIdPlan(Integer idPlan) {
    this.idPlan = idPlan;
  }

  public Plan nombrePlan(String nombrePlan) {
    this.nombrePlan = nombrePlan;
    return this;
  }




  public String getNombrePlan() {
    return nombrePlan;
  }

  public void setNombrePlan(String nombrePlan) {
    this.nombrePlan = nombrePlan;
  }

  public Plan tipoPlan(TipoPlan tipoPlan) {
    this.tipoPlan = tipoPlan;
    return this;
  }



  public TipoPlan getTipoPlan() {
    return tipoPlan;
  }

  public void setTipoPlan(TipoPlan tipoPlan) {
    this.tipoPlan = tipoPlan;
  }

  public Plan empresa(Empresa empresa) {
    this.empresa = empresa;
    return this;
  }


  public Empresa getEmpresa() {
    return empresa;
  }

  public void setEmpresa(Empresa empresa) {
    this.empresa = empresa;
  }

  public Plan cobertura(List<Cobertura> cobertura) {
    this.cobertura = cobertura;
    return this;
  }

  public Plan addCoberturaItem(Cobertura coberturaItem) {
    if (this.cobertura == null) {
      this.cobertura = new ArrayList<Cobertura>();
    }
    this.cobertura.add(coberturaItem);
    return this;
  }


  public List<Cobertura> getCobertura() {
    return cobertura;
  }

  public void setCobertura(List<Cobertura> cobertura) {
    this.cobertura = cobertura;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plan plan = (Plan) o;
    return Objects.equals(this.idPlan, plan.idPlan) &&
        Objects.equals(this.nombrePlan, plan.nombrePlan) &&
        Objects.equals(this.tipoPlan, plan.tipoPlan) &&
        Objects.equals(this.empresa, plan.empresa) &&
        Objects.equals(this.cobertura, plan.cobertura);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idPlan, nombrePlan, tipoPlan, empresa, cobertura);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plan {\n");
    
    sb.append("    idPlan: ").append(toIndentedString(idPlan)).append("\n");
    sb.append("    nombrePlan: ").append(toIndentedString(nombrePlan)).append("\n");
    sb.append("    tipoPlan: ").append(toIndentedString(tipoPlan)).append("\n");
    sb.append("    empresa: ").append(toIndentedString(empresa)).append("\n");
    sb.append("    cobertura: ").append(toIndentedString(cobertura)).append("\n");
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


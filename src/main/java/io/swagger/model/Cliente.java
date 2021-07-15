package io.swagger.model;

import java.math.BigInteger;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import io.swagger.db.models.ClienteDTO;
import io.swagger.db.models.EmpresaDTO;
import io.swagger.db.models.PlanDTO;
import io.swagger.db.models.Tipo_planDTO;
import io.swagger.model.PlanCorto;
import org.springframework.validation.annotation.Validated;

/**
 * Cliente
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")





public class Cliente   {
	
  @JsonProperty("id_cliente")
  private long idCliente = 0;
	
  @JsonProperty("nombres")
  private String nombres = null;

  @JsonProperty("apellidos")
  private String apellidos = null;

  @JsonProperty("tipo_plan")
  private String tipoPlan = null;

  @JsonProperty("entidad")
  private String entidad = null;

  @JsonProperty("plan")
  private PlanCorto plan = null;

  public Cliente nombres(String nombres) {
    this.nombres = nombres;
    return this;
  }
  
  //constructores
  
  public Cliente() {
	  
  }

  
  //getters y setters
  
  

  public String getNombres() {
    return nombres;
  }

  public long getIdCliente() {
	return idCliente;
}

public void setIdCliente(long idCliente) {
	this.idCliente = idCliente;
}

public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getTipoPlan() {
    return tipoPlan;
  }

  public void setTipoPlan(String tipoPlan) {
    this.tipoPlan = tipoPlan;
  }

  public String getEntidad() {
    return entidad;
  }

  public void setEntidad(String entidad) {
    this.entidad = entidad;
  }

  public PlanCorto getPlan() {
    return plan;
  }

  public void setPlan(PlanCorto plan) {
    this.plan = plan;
  }

  
  //metodos sobreescritos de la clase Object

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cliente cliente = (Cliente) o;
    return Objects.equals(this.nombres, cliente.nombres) &&
        Objects.equals(this.apellidos, cliente.apellidos) &&
        Objects.equals(this.tipoPlan, cliente.tipoPlan) &&
        Objects.equals(this.entidad, cliente.entidad) &&
        Objects.equals(this.plan, cliente.plan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombres, apellidos, tipoPlan, entidad, plan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cliente {\n");
    
    sb.append("    nombres: ").append(toIndentedString(nombres)).append("\n");
    sb.append("    apellidos: ").append(toIndentedString(apellidos)).append("\n");
    sb.append("    tipoPlan: ").append(toIndentedString(tipoPlan)).append("\n");
    sb.append("    entidad: ").append(toIndentedString(entidad)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
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


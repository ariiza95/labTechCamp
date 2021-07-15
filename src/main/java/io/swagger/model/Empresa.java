package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * Empresa
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")


public class Empresa   {
  @JsonProperty("id_empresa")
  private Integer idEmpresa = null;

  @JsonProperty("nombre_empresa")
  private String nombreEmpresa = null;

  public Empresa idEmpresa(Integer idEmpresa) {
    this.idEmpresa = idEmpresa;
    return this;
  }



  public Integer getIdEmpresa() {
    return idEmpresa;
  }

  public void setIdEmpresa(Integer idEmpresa) {
    this.idEmpresa = idEmpresa;
  }

  public Empresa nombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
    return this;
  }



  public String getNombreEmpresa() {
    return nombreEmpresa;
  }

  public void setNombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Empresa empresa = (Empresa) o;
    return Objects.equals(this.idEmpresa, empresa.idEmpresa) &&
        Objects.equals(this.nombreEmpresa, empresa.nombreEmpresa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idEmpresa, nombreEmpresa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Empresa {\n");
    
    sb.append("    idEmpresa: ").append(toIndentedString(idEmpresa)).append("\n");
    sb.append("    nombreEmpresa: ").append(toIndentedString(nombreEmpresa)).append("\n");
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


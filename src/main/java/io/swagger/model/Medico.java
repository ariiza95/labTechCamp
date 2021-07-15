package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * Medico
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")


public class Medico   {
  @JsonProperty("nombres")
  private String nombres = null;

  @JsonProperty("apellidos")
  private String apellidos = null;

  @JsonProperty("celular")
  private String celular = null;

  @JsonProperty("tarjeta_profesional")
  private String tarjetaProfesional = null;
  
  @JsonProperty("id_medico")
  private Integer id_medico = null;

  public Medico nombres(String nombres) {
    this.nombres = nombres;
    return this;
  }



  public Integer getId_medico() {
	return id_medico;
  }

  public void setId_medico(Integer id_medico) {
	this.id_medico = id_medico;
  }



public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public Medico apellidos(String apellidos) {
    this.apellidos = apellidos;
    return this;
  }



  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public Medico celular(String celular) {
    this.celular = celular;
    return this;
  }



  public String getCelular() {
    return celular;
  }

  public void setCelular(String celular) {
    this.celular = celular;
  }

  public Medico tarjetaProfesional(String tarjetaProfesional) {
    this.tarjetaProfesional = tarjetaProfesional;
    return this;
  }



  public String getTarjetaProfesional() {
    return tarjetaProfesional;
  }

  public void setTarjetaProfesional(String tarjetaProfesional) {
    this.tarjetaProfesional = tarjetaProfesional;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Medico medico = (Medico) o;
    return Objects.equals(this.nombres, medico.nombres) &&
        Objects.equals(this.apellidos, medico.apellidos) &&
        Objects.equals(this.celular, medico.celular) &&
        Objects.equals(this.id_medico, medico.id_medico) &&
        Objects.equals(this.tarjetaProfesional, medico.tarjetaProfesional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombres, apellidos, celular, tarjetaProfesional);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Medico {\n");
    
    sb.append("    id: ").append(toIndentedString(id_medico)).append("\n");
    sb.append("    nombres: ").append(toIndentedString(nombres)).append("\n");
    sb.append("    apellidos: ").append(toIndentedString(apellidos)).append("\n");
    sb.append("    celular: ").append(toIndentedString(celular)).append("\n");
    sb.append("    tarjetaProfesional: ").append(toIndentedString(tarjetaProfesional)).append("\n");
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



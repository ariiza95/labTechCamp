package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.db.models.RolDTO;
import io.swagger.db.models.UsuarioDTO;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * UsuarioActivo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-07-02T22:32:33.312Z")


public class UsuarioActivo   {
  @JsonProperty("id_Usuario")
  private Integer idUsuario = null;

  @JsonProperty("nombre_rol")
  private String nombreRol = null;

  @JsonProperty("nivel_acceso")
  private Integer nivelAcceso = null;
  
  public UsuarioActivo() {
	   
  }
  
  

  public UsuarioActivo(Integer idUsuario, String nombreRol, Integer nivelAcceso) {
	super();
	this.idUsuario = idUsuario;
	this.nombreRol = nombreRol;
	this.nivelAcceso = nivelAcceso;
}



public UsuarioActivo idUsuario(Integer idUsuario) {
    this.idUsuario = idUsuario;
    return this;
  }

  public Integer getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(Integer idUsuario) {
    this.idUsuario = idUsuario;
  }

  public UsuarioActivo nombreRol(String nombreRol) {
    this.nombreRol = nombreRol;
    return this;
  }

  public String getNombreRol() {
    return nombreRol;
  }

  public void setNombreRol(String nombreRol) {
    this.nombreRol = nombreRol;
  }

  public UsuarioActivo nivelAcceso(Integer nivelAcceso) {
    this.nivelAcceso = nivelAcceso;
    return this;
  }

  public Integer getNivelAcceso() {
    return nivelAcceso;
  }

  public void setNivelAcceso(Integer nivelAcceso) {
    this.nivelAcceso = nivelAcceso;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsuarioActivo usuarioActivo = (UsuarioActivo) o;
    return Objects.equals(this.idUsuario, usuarioActivo.idUsuario) &&
        Objects.equals(this.nombreRol, usuarioActivo.nombreRol) &&
        Objects.equals(this.nivelAcceso, usuarioActivo.nivelAcceso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idUsuario, nombreRol, nivelAcceso);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioActivo {\n");
    
    sb.append("    idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
    sb.append("    nombreRol: ").append(toIndentedString(nombreRol)).append("\n");
    sb.append("    nivelAcceso: ").append(toIndentedString(nivelAcceso)).append("\n");
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


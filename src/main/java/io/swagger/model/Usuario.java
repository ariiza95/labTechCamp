package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.validation.annotation.Validated;

/**
 * Usuario
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")


public class Usuario   {
  @JsonProperty("nombre_usuario")
  private String nombreUsuario = null;

  @JsonProperty("contrasea")
  private String contrasea = null;

  
  public Usuario(String nombreUsuario, String contrasea) {
	super();
	this.nombreUsuario = nombreUsuario;
	this.contrasea = contrasea;
  }
  public Usuario() {
	  
  }

public String getNombreUsuario() {
    return nombreUsuario;
  }

  public void setNombreUsuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
  }

  public String getContrasea() {
    return contrasea;
  }

  public void setContrasea(String contrasea) {
    this.contrasea = contrasea;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Usuario usuario = (Usuario) o;
    return Objects.equals(this.nombreUsuario, usuario.nombreUsuario) &&
        Objects.equals(this.contrasea, usuario.contrasea);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombreUsuario, contrasea);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Usuario {\n");
    
    sb.append("    nombreUsuario: ").append(toIndentedString(nombreUsuario)).append("\n");
    sb.append("    contrasea: ").append(toIndentedString(contrasea)).append("\n");
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


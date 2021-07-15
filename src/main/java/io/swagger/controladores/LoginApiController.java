package io.swagger.controladores;

import io.swagger.gestores.LoginGestor;
import io.swagger.model.Usuario;
import io.swagger.model.UsuarioActivo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")

@RestController
@RequestMapping(path="/login")
@CrossOrigin(origins = "*")
public class LoginApiController {

	@Autowired
	LoginGestor gestorlogin;

	@PostMapping
    public UsuarioActivo comprobarCredenciales(@RequestBody Usuario credenciales) {
		try {
	        if(credenciales!=null)
	        	if(!credenciales.getNombreUsuario().isBlank()&&!credenciales.getContrasea().isBlank()) {
	        		return gestorlogin.comprobarUsuario(credenciales);
	        }
		}catch(Exception ex) {
			System.out.println("Error en la api para verificar credenciales del usuario");			
		}	    
        return null;
    }

}

package io.swagger.controladores;

import io.swagger.gestores.ClientesGestor;
import io.swagger.model.Cliente;
import io.swagger.model.TipoIdentificacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")

@RestController
@RequestMapping(path="/clientes")
@CrossOrigin(origins = "*")
public class ClientesApiController{

	@Autowired
	private ClientesGestor gestorCl;
	
	
    @GetMapping(path="/{numero_identificacion},{id_tipo_identificacion}")    
    public Cliente obtenerInformacionCliente(@PathVariable("numero_identificacion") String numeroIdentificacion
    		, @PathVariable("id_tipo_identificacion") Integer idTipoDocumento){
    	    	
    	
    	/*Cliente cliente=new Cliente();
    	cliente.setNombres("asd");
    	cliente.setApellidos(numeroIdentificacion+"-"+idTipoDocumento);
    	cliente.setEntidad("SaludCoop");
    	cliente.setNombrePlan("Basico");
    	cliente.setTipoPlan("EPS");*/
    	
    	
    	return gestorCl.solicitarClienteCompleto(numeroIdentificacion, idTipoDocumento);
    }

    @GetMapping(path="/tiposid")
    public List<TipoIdentificacion> obtenerTiposIdentificacion() {
    	try {			
			List<TipoIdentificacion> lista= gestorCl.solicitarTodosLosTiposDeIdentificacion();			
			return lista;
		}catch(Exception ex) {
			System.out.println("Error en la api para solicitar todos los tipos de identificacion");
			return null;
		}	       
    }
    
    @GetMapping(path="/crearNuevaCita")
    public int crearNuevaCita() {
    	try {							
			return gestorCl.crear_cita_generica();
		}catch(Exception ex) {
			System.out.println("Error en la creacion de una nueva cita generica");
			return 0;
		}	       
    }
    @GetMapping(path="/crearNuevaCitaS")
    public void crearNuevaCitaS() {
    	try {							
			gestorCl.crear_cita_genericaS();
		}catch(Exception ex) {
			System.out.println("Error en la creacion de una nueva cita generica");
			
		}	       
    }
}

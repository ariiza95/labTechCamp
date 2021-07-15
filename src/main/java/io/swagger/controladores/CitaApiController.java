package io.swagger.controladores;

import io.swagger.db.daos.CitasDAOJPA;
import io.swagger.db.models.CitaDTO;
import io.swagger.gestores.CitasGestor;
import io.swagger.model.CitaCliente;
import io.swagger.model.SolicitudCita;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")

@RestController
@RequestMapping(path="/cita")
@CrossOrigin(origins = "*")
public class CitaApiController {

	@Autowired
	CitasGestor gestorcitas;	
	
    @PostMapping()
    public CitaCliente asignarCitaMasProxima(@RequestBody SolicitudCita solicitud)  {
        
    	
    	return gestorcitas.AgendarCita(solicitud);
    }




}

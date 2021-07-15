package io.swagger.controladores;

import io.swagger.gestores.CubiculosGestor;
import io.swagger.model.CitaCubiculo;
import io.swagger.model.Cubiculo;
import java.util.List;
import io.swagger.model.SolicitudReasignacionCubiculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")

@RestController
@RequestMapping(path="/cubiculos")
@CrossOrigin(origins = "*")
public class CubiculosApiController{
	
	@Autowired
	CubiculosGestor gestorCubs;

	@PostMapping
    public boolean actualizarCubiculos( @RequestBody List<Cubiculo> cubiculo)  {
        
        return true;
    }

	@GetMapping
    public List<Cubiculo> obtenerCubiculos() {
        

        return gestorCubs.solicitarCubiculos();
    }

	@GetMapping("/examen_{id_examen}")
    public List<Cubiculo> obtenerCubiculosExamen(@PathVariable("id_examen") Integer idExamen) {
       return gestorCubs.solicitarCubiculos(idExamen);
    }

	@PostMapping("/reagendar")
    public List<CitaCubiculo> reagendarCitas(@RequestBody SolicitudReasignacionCubiculo solicitudReasignacion) {
        
        return null;
    }

}

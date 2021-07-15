package io.swagger.controladores;

import io.swagger.db.daos.PlanesDAOJPA;
import io.swagger.gestores.PlanesGestor;
import io.swagger.model.Empresa;
import io.swagger.model.Examen;
import io.swagger.model.Plan;

import java.util.List;
import io.swagger.model.PlanCorto;
import io.swagger.model.SolicitudPlanNuevo;
import io.swagger.model.TipoPlan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")

@RestController
@RequestMapping(path="/planes")
@CrossOrigin(origins = "*")
public class PlanesApiController{
	
	@Autowired
	PlanesGestor gestorplanes;

	  
	@PostMapping("/{id_plan}")
    public boolean actualizarPlanModificado(@PathVariable("id_plan") Integer idPlan, @RequestBody Plan planModificado) {
        
        return false;
    }

	@GetMapping("/empresas")
    public List<Empresa> obtenerEmpresas() {
        

        return gestorplanes.solicitarEmpresas();
    }
	
	
	@GetMapping("/examenesN_{id_plan}")
    public List<Examen> obtenerExamenesNoRegistradosPlan(@PathVariable("id_plan") Integer idPlan) {
        
        return gestorplanes.solicitarExamenesNoRegistradosPorPlan(idPlan);
    }

	@GetMapping("/{id_plan}")
    public Plan obtenerPlan(@PathVariable("id_plan") Integer idPlan) {
        

        return gestorplanes.solicitarPlan(idPlan);
    }

    
    @GetMapping("/empresa_{id_empresa}")
    public List<PlanCorto> obtenerPlanesEmpresa(@PathVariable("id_empresa") Integer idEmpresa) {
        return gestorplanes.solicitarPlanes(idEmpresa);
    }

    @GetMapping("/tipos")
    public List<TipoPlan> obtenerTiposPlanes() {
        
    	
        return gestorplanes.solicitarTiposPlanes();
    }

    @PostMapping()
    public Integer registrarPlanNuevo(@RequestBody SolicitudPlanNuevo solicitudNuevoPlan) {        
    	
        return gestorplanes.agregarPlanNuevo(solicitudNuevoPlan);
    }

}

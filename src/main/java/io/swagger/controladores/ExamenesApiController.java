package io.swagger.controladores;

import io.swagger.gestores.ExamenesGestor;
import io.swagger.model.Examen;
import io.swagger.model.TiposExamen;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")

@RestController
@RequestMapping(path="/examenes")
@CrossOrigin(origins = "*")
public class ExamenesApiController {

	@Autowired
	ExamenesGestor gestorExams;
	
	@GetMapping("/{id_plan}")
    public List<Examen> obtenerExamenes(@PathVariable("id_plan") int id_plan) {
        
        return gestorExams.solicitarExamenesPorPlan(id_plan);
    }

	@GetMapping("/tipos")
    public List<TiposExamen> obtenerTiposExamenes() {
        return gestorExams.solicitarTiposExamen();
    }

}

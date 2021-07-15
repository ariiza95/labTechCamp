package io.swagger.controladores;

import io.swagger.gestores.MedicosGestor;
import io.swagger.model.CitaMedico;
import io.swagger.model.Medico;
import io.swagger.model.SolicitudReasignacionMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-06-22T14:01:56.778Z")

@RestController
@RequestMapping(path="/medicos")
@CrossOrigin(origins = "*")
public class MedicosApiController {

	@Autowired
	MedicosGestor gestormedicos;
	
	@GetMapping("/citasf_{id_medico}")
    public List<CitaMedico> obtenerCitasFuturasMedico(@PathVariable("id_medico") int id_medico) {
        

        return gestormedicos.solicitarTodasLasCitasFuturasDeUnMedico(id_medico);
    }

	@GetMapping("/citast_{id_medico}")
    public List<CitaMedico> obtenerCitasMedico(@PathVariable("id_medico") int id_medico) {
 
        return gestormedicos.solicitarCitasDeUnMedico(id_medico);
    }

	@GetMapping()
    public List<Medico> obtenerMedicos() {
		
        return gestormedicos.solicitarTodosLosMedicos();
    }

	@PostMapping("/reagendar")
    public Void reasignarCitas(@RequestBody SolicitudReasignacionMedico solicitudReasignacion) {
        
    	return null;
    }

}

package io.swagger.gestores;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import io.swagger.db.daos.CitasDAOJPA;
import io.swagger.db.daos.ClientesDAOJPA;
import io.swagger.db.daos.CubiculosDAOJPA;
import io.swagger.db.daos.EmpresasDAOJPA;
import io.swagger.db.daos.ExamenesDAOJPA;
import io.swagger.db.daos.MedicosDAOJPA;
import io.swagger.db.daos.PlanesDAOJPA;
import io.swagger.db.daos.TiposDePlanesDAOJPA;
import io.swagger.db.daos.TiposIdentificacionDAOJPA;
import io.swagger.db.models.CitaDTO;
import io.swagger.db.models.ClienteDTO;
import io.swagger.db.models.CubiculoDTO;
import io.swagger.db.models.EmpresaDTO;
import io.swagger.db.models.ExamenDTO;
import io.swagger.db.models.MedicoDTO;
import io.swagger.db.models.PlanDTO;
import io.swagger.db.models.Tipo_identificacionDTO;
import io.swagger.db.models.Tipo_planDTO;
import io.swagger.model.CitaCliente;
import io.swagger.model.Cliente;
import io.swagger.model.Fabrica_objetos_swagger;
import io.swagger.model.SolicitudCita;
import io.swagger.model.TipoIdentificacion;


@Service
@Transactional
public class CitasGestor{
	
	List<String> horasDisponibles;
	@Value("${HorarioTrabajo.inicio}")	
	int hora_inicio;
	@Value("${HorarioTrabajo.fin}")	
	int hora_fin;
	@Value("${DiasTrabajo.inicio}")	
	int dia_inicio;
	@Value("${DiasTrabajo.fin}")	
	int dia_fin;

	@Autowired
	CitasDAOJPA citasdao;
	@Autowired
	MedicosDAOJPA medicosdao;
	@Autowired
	ExamenesDAOJPA examenesdao;
	@Autowired
	CubiculosDAOJPA cubiculosdao;
	@Autowired
	EmpresasDAOJPA empresadao;
	
	@Autowired
	Fabrica_objetos_swagger fabrica_retornos;
		
	

	public CitaCliente AgendarCita(SolicitudCita solicitud) {
		CitaDTO citaFinal=encontrarCitaMasProxima(solicitud);
//		CitaDTO guardado=citasdao.save(citaFinal);
		CitaDTO guardado=citasdao.findById(citasdao.agregar_Cita(
				fabrica_retornos.getPatternFechas().format(citaFinal.getFecha_cita()),
				citaFinal.getId_medico(),
				citaFinal.getId_cubiculo(),
				citaFinal.getId_cliente(),
				citaFinal.getId_examen(),
				citaFinal.getCosto_cita(),
				solicitud.getIdUsuario()
				)).get();
		MedicoDTO medico=medicosdao.getById(guardado.getId_medico());
		ExamenDTO examen=examenesdao.getById(guardado.getId_examen());
		CubiculoDTO cubiculo=cubiculosdao.getById(guardado.getId_cubiculo());
    	if(citaFinal.getId_cliente()==guardado.getId_cliente()) {
    		return fabrica_retornos.crearCitadeClienteRetorno(guardado, medico, examen, cubiculo);
    	}else {
    		return null;
    	}
	}
	
	
	private CitaDTO encontrarCitaMasProxima(SolicitudCita solicitud) {
		SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy HH:mm");
		CitaDTO cita_retorno=null;
		try {
			Date fecha=ft.parse("14-07-2021 14:20");			
			cita_retorno=new CitaDTO(0,fecha,1,2,3,4,"15600");
		}catch(Exception ex) {
			
		}
		
		return cita_retorno;
	}
	
}

package io.swagger.gestores;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.db.daos.CitasDAOJPA;
import io.swagger.db.daos.ClientesDAOJPA;
import io.swagger.db.daos.CoberturasDAOJPA;
import io.swagger.db.daos.CubiculosDAOJPA;
import io.swagger.db.daos.EmpresasDAOJPA;
import io.swagger.db.daos.ExamenesDAOJPA;
import io.swagger.db.daos.MedicosDAOJPA;
import io.swagger.db.daos.PlanesDAOJPA;
import io.swagger.db.daos.TiposDePlanesDAOJPA;
import io.swagger.db.daos.TiposIdentificacionDAOJPA;
import io.swagger.db.models.CitaDTO;
import io.swagger.db.models.ClienteDTO;
import io.swagger.db.models.CoberturaDTO;
import io.swagger.db.models.CubiculoDTO;
import io.swagger.db.models.ExamenDTO;
import io.swagger.db.models.MedicoDTO;
import io.swagger.model.CitaMedico;
import io.swagger.model.Fabrica_objetos_swagger;
import io.swagger.model.Medico;


@Service
@Transactional
public class MedicosGestor{

	@Autowired
	MedicosDAOJPA medicosdao;
	@Autowired
	CitasDAOJPA citasdao;
	@Autowired
	ClientesDAOJPA clientesdao;
	@Autowired
	ExamenesDAOJPA examenesdao;
	@Autowired
	CubiculosDAOJPA cubiculosdao;
	@Autowired
	CoberturasDAOJPA coberturasdao;
	
	@Autowired
	Fabrica_objetos_swagger fabrica_retornos;
		
	
	public List<Medico> solicitarTodosLosMedicos(){
		
		//List<TipoIdentificacion> lista=clientesdao.consultarTodosLosTiposDeIdentificacion();
		List<MedicoDTO> lista=medicosdao.findAll();
		List<Medico> retorno=new ArrayList<Medico>();
		for(int i=0;i<lista.size();i++) {
			retorno.add(fabrica_retornos.crearMedicoRetorno(lista.get(i)));
		}
		return retorno;
		
	}
	
	public List<CitaMedico> solicitarTodasLasCitasFuturasDeUnMedico(int id_medico){
		List<CitaDTO> listaCitas=citasdao.findCitasFuturasDeMedico(id_medico);
		return generarCitasRetorno(listaCitas);		
	}
	
	public List<CitaMedico> solicitarCitasPorFechas(int id_medico,String fecha_inicio,String fecha_fin){
		List<CitaDTO> listaCitas=citasdao.findCitasMedicoPorFechas(id_medico,fecha_inicio,fecha_fin);
		return generarCitasRetorno(listaCitas);		
	}
	
	public List<CitaMedico> solicitarCitasDeUnMedico(int id_medico){
		List<CitaDTO> listaCitas=citasdao.findCitasMedico(id_medico);
		return generarCitasRetorno(listaCitas);
	}

	public List<CitaMedico> generarCitasRetorno(List<CitaDTO> listaCitas){
		ClienteDTO cliente=null;
		ExamenDTO examen=null;
		CubiculoDTO cubiculo=null;
		List<CitaMedico> listaRetorno=new ArrayList<CitaMedico>();
		for(int i=0;i<listaCitas.size();i++) {
			cliente=clientesdao.getById(listaCitas.get(i).getId_cliente());
			examen=examenesdao.getById(listaCitas.get(i).getId_examen());
			cubiculo=cubiculosdao.getById(listaCitas.get(i).getId_cubiculo());			
			listaRetorno.add(fabrica_retornos.crearCitadeMedicoRetorno(listaCitas.get(i), cliente, examen, cubiculo));
		}
		return listaRetorno;	
	}
	
}

package io.swagger.gestores;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.db.daos.ClientesDAOJPA;
import io.swagger.db.daos.CubiculosDAOJPA;
import io.swagger.db.daos.EmpresasDAOJPA;
import io.swagger.db.daos.ExamenesDAOJPA;
import io.swagger.db.daos.PlanesDAOJPA;
import io.swagger.db.daos.TipoExamenesDAOJPA;
import io.swagger.db.daos.TiposDePlanesDAOJPA;
import io.swagger.db.daos.TiposIdentificacionDAOJPA;
import io.swagger.db.models.ClienteDTO;
import io.swagger.db.models.CubiculoDTO;
import io.swagger.db.models.EmpresaDTO;
import io.swagger.db.models.ExamenDTO;
import io.swagger.db.models.PlanDTO;
import io.swagger.db.models.Tipo_examenDTO;
import io.swagger.db.models.Tipo_identificacionDTO;
import io.swagger.db.models.Tipo_planDTO;
import io.swagger.model.Cliente;
import io.swagger.model.Cubiculo;
import io.swagger.model.Examen;
import io.swagger.model.Fabrica_objetos_swagger;
import io.swagger.model.TipoIdentificacion;
import io.swagger.model.TiposExamen;


@Service
@Transactional
public class ExamenesGestor{

	@Autowired
	ExamenesDAOJPA examenesdao;
	@Autowired
	TipoExamenesDAOJPA tiposExamenesdao;
	
	@Autowired
	Fabrica_objetos_swagger fabrica_retornos;
		
	
	public List<Examen> solicitarExamenes(){
		
		//List<TipoIdentificacion> lista=clientesdao.consultarTodosLosTiposDeIdentificacion();
		List<ExamenDTO> examenesdto=examenesdao.findAll();
		List<Examen> retorno=new ArrayList<Examen>();
		Optional<Tipo_examenDTO> tipo_examen;
		if(examenesdto!=null && examenesdto.size()>0) {
			for(int i=0;i<examenesdto.size();i++) {
				tipo_examen=tiposExamenesdao.findById(examenesdto.get(i).getId_tipo_examen());
				retorno.add(fabrica_retornos.crearExamenRetorno(examenesdto.get(i),tipo_examen.get()));
			}
		}
		return retorno;
		
	}
	
	public Examen solicitarExamen(int id_examen) {
		ExamenDTO examendto=examenesdao.findById(id_examen).get();
		Examen examenretorno=null;
		Optional<Tipo_examenDTO> tipo_examen=null;
		if(examendto!=null)
			tipo_examen=tiposExamenesdao.findById(examendto.getId_tipo_examen());
			examenretorno=fabrica_retornos.crearExamenRetorno(examendto, tipo_examen.get());
		return examenretorno;
		
	}
	
	
	
	public List<Examen> solicitarExamenesPorPlan(int id_plan){
		
		List<ExamenDTO> examenesdto=examenesdao.findExamenesByPlan(id_plan);
		List<Examen> retorno=new ArrayList<Examen>();
		Optional<Tipo_examenDTO> tipo_examen;
		if(examenesdto!=null && examenesdto.size()>0) {
			for(int i=0;i<examenesdto.size();i++) {
				tipo_examen=tiposExamenesdao.findById(examenesdto.get(i).getId_tipo_examen());
				retorno.add(fabrica_retornos.crearExamenRetorno(examenesdto.get(i),tipo_examen.get()));
			}
		}		
		return retorno;
		
	}
	
	public List<TiposExamen> solicitarTiposExamen() {
		List<Tipo_examenDTO> tiposExamenesdto=tiposExamenesdao.findAll();
		List<TiposExamen> retorno=new ArrayList<TiposExamen>();
		if(tiposExamenesdto!=null && tiposExamenesdto.size()>0) {
			for(int i=0;i<tiposExamenesdto.size();i++) {				
				retorno.add(fabrica_retornos.crearTipoExamenRetorno(tiposExamenesdto.get(i)));
			}
		}
		return retorno;
		
	}
	
}

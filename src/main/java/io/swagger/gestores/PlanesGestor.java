package io.swagger.gestores;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.db.daos.ClientesDAOJPA;
import io.swagger.db.daos.CoberturasDAOJPA;
import io.swagger.db.daos.CubiculosDAOJPA;
import io.swagger.db.daos.EmpresasDAOJPA;
import io.swagger.db.daos.ExamenesDAOJPA;
import io.swagger.db.daos.PlanesDAOJPA;
import io.swagger.db.daos.TipoExamenesDAOJPA;
import io.swagger.db.daos.TiposDePlanesDAOJPA;
import io.swagger.db.daos.TiposIdentificacionDAOJPA;
import io.swagger.db.models.ClienteDTO;
import io.swagger.db.models.CoberturaDTO;
import io.swagger.db.models.CubiculoDTO;
import io.swagger.db.models.EmpresaDTO;
import io.swagger.db.models.ExamenDTO;
import io.swagger.db.models.PlanDTO;
import io.swagger.db.models.Tipo_examenDTO;
import io.swagger.db.models.Tipo_identificacionDTO;
import io.swagger.db.models.Tipo_planDTO;
import io.swagger.model.Cliente;
import io.swagger.model.Cubiculo;
import io.swagger.model.Empresa;
import io.swagger.model.Examen;
import io.swagger.model.Fabrica_objetos_swagger;
import io.swagger.model.Plan;
import io.swagger.model.PlanCorto;
import io.swagger.model.SolicitudPlanNuevo;
import io.swagger.model.TipoIdentificacion;
import io.swagger.model.TipoPlan;
import io.swagger.model.TiposExamen;


@Service
@Transactional
public class PlanesGestor{

	@Autowired
	EmpresasDAOJPA empresasdao;
	@Autowired
	PlanesDAOJPA planesdao;
	@Autowired
	TiposDePlanesDAOJPA tiposPlanesdao;
	@Autowired
	CoberturasDAOJPA coberturasdao;
	@Autowired
	ExamenesDAOJPA examenesdao;
	@Autowired
	TipoExamenesDAOJPA tipoexamenesdao;
	
	@Autowired
	Fabrica_objetos_swagger fabrica_retornos;
		
	
	public List<Empresa> solicitarEmpresas(){//solicita todas las empresas registradas en la base de datos
		
		//List<TipoIdentificacion> lista=clientesdao.consultarTodosLosTiposDeIdentificacion();
		List<EmpresaDTO> empresasdto=empresasdao.findAll();
		List<Empresa> retorno=new ArrayList<Empresa>();
		if(empresasdto!=null && empresasdto.size()>0) {
			for(int i=0;i<empresasdto.size();i++) {				
				retorno.add(fabrica_retornos.crearEmpresaRetorno(empresasdto.get(i)));
			}
		}
		return retorno;
		
	}
	
	public Plan solicitarPlan(int id_plan) {//solicita toda la informacion de un plan
		PlanDTO planDTO=planesdao.findById(id_plan).get();		
		Tipo_planDTO tipoplandto=null;
		EmpresaDTO empresadto=null;
		List<CoberturaDTO> lista_coberturasdto=new ArrayList<CoberturaDTO>();		
		List<ExamenDTO> examenesdto=new ArrayList<ExamenDTO>();
		List<Tipo_examenDTO> tipos_examendto=new ArrayList<Tipo_examenDTO>();
		if(planDTO!=null) {							
			tipoplandto=tiposPlanesdao.getById(planDTO.getId_tipo_plan());
			empresadto=empresasdao.getById(planDTO.getId_empresa_prestadora());
			lista_coberturasdto=coberturasdao.findByPlan(planDTO.getId_plan());
			examenesdto=examenesdao.findAll();
			tipos_examendto=tipoexamenesdao.findAll();
			return fabrica_retornos.crearPlanRetorno(planDTO,tipoplandto,empresadto,lista_coberturasdto,examenesdto,tipos_examendto);			
		}
		return null;
		
	}
	
	public List<Plan> solicitarPlanes(){//solicita todos los planes registrados en la base de datos
			
		List<PlanDTO> planesdto=planesdao.findAll();
		List<Plan> retorno=new ArrayList<Plan>();
		Tipo_planDTO tipoplandto=null;
		EmpresaDTO empresadto=null;
		List<CoberturaDTO> lista_coberturasdto=new ArrayList<CoberturaDTO>();		
		List<ExamenDTO> examenesdto=new ArrayList<ExamenDTO>();
		List<Tipo_examenDTO> tipos_examendto=new ArrayList<Tipo_examenDTO>();
		if(planesdto!=null && planesdto.size()>0) {
			for(int i=0;i<planesdto.size();i++) {				
				tipoplandto=tiposPlanesdao.getById(planesdto.get(i).getId_tipo_plan());
				empresadto=empresasdao.getById(planesdto.get(i).getId_empresa_prestadora());
				lista_coberturasdto=coberturasdao.findByPlan(planesdto.get(i).getId_plan());
				examenesdto=examenesdao.findAll();
				tipos_examendto=tipoexamenesdao.findAll();
				retorno.add(fabrica_retornos.crearPlanRetorno(planesdto.get(i),tipoplandto,empresadto,lista_coberturasdto,examenesdto,tipos_examendto));
			}
		}
		return retorno;
		
	}
	
	public List<PlanCorto> solicitarPlanes(int id_empresa){//solicita todos los planes de una empresa registrados en la bd
		
		List<PlanDTO> planesdto=planesdao.findByEmpresa(id_empresa);
		List<PlanCorto> retorno=new ArrayList<PlanCorto>();	
		Tipo_planDTO tipoplandto=null;
		if(planesdto!=null && planesdto.size()>0) {
			for(int i=0;i<planesdto.size();i++) {				
				tipoplandto=tiposPlanesdao.getById(planesdto.get(i).getId_tipo_plan());
				retorno.add(fabrica_retornos.crearPlanCortoRetorno(planesdto.get(i),tipoplandto));
			}
		}
		return retorno;
		
	}
		
	public List<Examen> solicitarExamenesNoRegistradosPorPlan(int id_plan){		
		List<ExamenDTO> examenesdto=examenesdao.findExamenesNoRegistradosByPlan(id_plan);
		List<Examen> retorno=new ArrayList<Examen>();
		Optional<Tipo_examenDTO> tipo_examen;
		if(examenesdto!=null && examenesdto.size()>0) {
			for(int i=0;i<examenesdto.size();i++) {
				tipo_examen=tipoexamenesdao.findById(examenesdto.get(i).getId_tipo_examen());
				retorno.add(fabrica_retornos.crearExamenRetorno(examenesdto.get(i),tipo_examen.get()));
			}
		}		
		return retorno;
		
	}
	
	public List<TipoPlan> solicitarTiposPlanes() {
		List<Tipo_planDTO> tiposPlanesdto=tiposPlanesdao.findAll();
		List<TipoPlan> retorno=new ArrayList<TipoPlan>();
		if(tiposPlanesdto!=null && tiposPlanesdto.size()>0) {
			for(int i=0;i<tiposPlanesdto.size();i++) {				
				retorno.add(fabrica_retornos.crearTipoPlanRetorno(tiposPlanesdto.get(i)));
			}
		}
		return retorno;
		
	}
	
	public int agregarPlanNuevo(SolicitudPlanNuevo solicitudNuevoPlan) {
		PlanDTO planAgregar=new PlanDTO(0,solicitudNuevoPlan.getNombreNuevoPlan(),solicitudNuevoPlan.getIdTipoPlan()
				,solicitudNuevoPlan.getIdEmpresaSeleccionado());
		planAgregar=planesdao.save(planAgregar);
		if(planAgregar!=null) {
			if(planAgregar.getId_plan()>0)
				return planAgregar.getId_plan();
		}
		return 0;
	}
}

package io.swagger.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import io.swagger.db.models.*;


@Service
public class Fabrica_objetos_swagger {
	
	String patternFechas = "dd/MM/yyyy HH:mm";
	private	DateFormat dfFechas = new SimpleDateFormat(patternFechas);
	
	

	public DateFormat getPatternFechas() {
		return dfFechas;
	}

	public void setPatternFechas(String patternFechas) {
		this.patternFechas = patternFechas;
	}

	public Cliente crearClienteRetorno(ClienteDTO clientedto, Tipo_planDTO tipoplandto,PlanDTO plandto,EmpresaDTO empresadto) {
		Cliente cli=new Cliente();
		cli.setIdCliente(clientedto.getId_Ciente());
		cli.setNombres(clientedto.getNombres());
		cli.setApellidos(clientedto.getApellidos());
		cli.setTipoPlan(tipoplandto.getNombre_tipo_plan());
		cli.setEntidad(empresadto.getNombre_empresa());		
		cli.setPlan(new PlanCorto(plandto.getId_plan(),plandto.getNombre_plan()));
		System.out.println(cli.getPlan().getNombrePlan());
		return cli;
	}
	
	public UsuarioActivo crearUsuarioActivoRetorno(UsuarioDTO usuario,RolDTO rol) {
		UsuarioActivo usuarioAct=new UsuarioActivo();
		usuarioAct.setIdUsuario(usuario.getId_usuario());
		usuarioAct.setNombreRol(rol.getNombre_rol());
		usuarioAct.setNivelAcceso(rol.getNivel_privilegio());
		return usuarioAct;
	}
	
	public Cubiculo crearCubiculoRetorno(CubiculoDTO cubiculodto,Tipo_examenDTO tipoExamen) {
		Cubiculo cubiculo=new Cubiculo();
		cubiculo.setDescripcion(cubiculodto.getDescripcion());
		cubiculo.setDisponibilidad(cubiculodto.isDisponibilidad());
		cubiculo.setIdCubiculo(cubiculodto.getId_Cubiculo());
		cubiculo.setIdTipoExamen(cubiculodto.getId_tipo_examen());
		cubiculo.setNombreTipoExamen(tipoExamen.getNombre_tipo_examen());
		cubiculo.setNumeroCubiculo(cubiculodto.getNumero_cubiculo());
		return cubiculo;
	}
	
	public TiposExamen crearTipoExamenRetorno(Tipo_examenDTO tipo_examen) {
		TiposExamen tipoExamen=new TiposExamen();
		tipoExamen.setIdTipoExamen(tipo_examen.getId_tipo_examen());
		tipoExamen.setNombreTipoExamen(tipo_examen.getNombre_tipo_examen());
		return tipoExamen;
	}
	
	public Examen crearExamenRetorno(ExamenDTO examendto,Tipo_examenDTO tipo_examen) {
		Examen examen=new Examen();
		examen.setIdExamen(examendto.getId_Examen());
		examen.setNombreExamen(examendto.getNombre_examen());
		examen.setTipoExamen(crearTipoExamenRetorno(tipo_examen));
		return examen;		
	}
	
	public TipoIdentificacion crearTipoIdentificacionRetorno(Tipo_identificacionDTO tipo_identificaciondto) {
		return new TipoIdentificacion(tipo_identificaciondto.getId_tipo_identificacion(),tipo_identificaciondto.getNombre_tipo_identificacion());
	}
	
	public Medico crearMedicoRetorno(MedicoDTO medicodto) {
		Medico medico=new Medico();
		medico.setId_medico(medicodto.getId_Medico());
		medico.setApellidos(medicodto.getApellidos());
		medico.setNombres(medicodto.getNombres());
		medico.setCelular(medicodto.getCelular());
		medico.setTarjetaProfesional(medicodto.getTarjeta_profesional());
		return medico;		
	}
	
	public CitaMedico crearCitadeMedicoRetorno(CitaDTO citadto,ClienteDTO cliente,ExamenDTO examen,CubiculoDTO cubiculo) {
		String hora=citadto.getFecha_cita().getHours()+":"+citadto.getFecha_cita().getMinutes();
		CitaMedico cita_retorno=new CitaMedico();
		cita_retorno.setCliente(cliente.getNombres()+" "+cliente.getApellidos());
		cita_retorno.setCosto(citadto.getCosto_cita());
		cita_retorno.setCubiculo(cubiculo.getNumero_cubiculo());
		cita_retorno.setExamen(examen.getNombre_examen());
		cita_retorno.setFecha(dfFechas.format(citadto.getFecha_cita()));
		cita_retorno.setHora(hora);		
		return cita_retorno;
	}
	public CitaCliente crearCitadeClienteRetorno(CitaDTO citadto,MedicoDTO medico,ExamenDTO examen,CubiculoDTO cubiculo) {
		String hora=citadto.getFecha_cita().getHours()+":"+citadto.getFecha_cita().getMinutes();
		CitaCliente cita_retorno=new CitaCliente();
		cita_retorno.setMedico(medico.getNombres()+" "+medico.getApellidos());
		cita_retorno.setCosto(citadto.getCosto_cita());
		cita_retorno.setCubiculo(cubiculo.getNumero_cubiculo());
		cita_retorno.setExamen(examen.getNombre_examen());
		cita_retorno.setFecha(dfFechas.format(citadto.getFecha_cita()));
		cita_retorno.setHora(hora);		
		return cita_retorno;
	}
	public CitaCubiculo crearCitadeCubiculoRetorno(CitaDTO citadto,ClienteDTO cliente,ExamenDTO examen,CubiculoDTO cubiculo) {
		String hora=citadto.getFecha_cita().getHours()+":"+citadto.getFecha_cita().getMinutes();
		CitaCubiculo cita_retorno=new CitaCubiculo();
		cita_retorno.setCliente(cliente.getNombres()+" "+cliente.getApellidos());
		cita_retorno.setCubiculo(cubiculo.getNumero_cubiculo());
		cita_retorno.setExamen(examen.getNombre_examen());
		cita_retorno.setFecha(dfFechas.format(citadto.getFecha_cita()));
		cita_retorno.setHora(hora);	
		cita_retorno.setCelular(cliente.getCelular());
		return cita_retorno;
	}
	
	public Empresa crearEmpresaRetorno(EmpresaDTO empresadto) {
		Empresa empresa_retorno=new Empresa();
		empresa_retorno.setIdEmpresa(empresadto.getId_empresa());
		empresa_retorno.setNombreEmpresa(empresadto.getNombre_empresa());
		return empresa_retorno;		
	}

	public Plan crearPlanRetorno(PlanDTO plandto,Tipo_planDTO tipoplandto,EmpresaDTO empresa,List<CoberturaDTO> lista_coberturasdto,
			List<ExamenDTO> examenesdto,List<Tipo_examenDTO> tipos_examendto) {
		Plan plan_retorno=new Plan();		
		plan_retorno.setIdPlan(plandto.getId_plan());
		plan_retorno.setNombrePlan(plandto.getNombre_plan());
		plan_retorno.setTipoPlan(crearTipoPlanRetorno(tipoplandto));
		plan_retorno.setEmpresa(crearEmpresaRetorno(empresa));		
		List<Cobertura> lista_cobertura_retorno=new ArrayList<Cobertura>();
		
		//pasar la lista de coberturas del modelo de la base de datos al modelo de retorno
		ExamenDTO examendto=null;
		Tipo_examenDTO tipo_examendto=null;
		
		for(int i=0;i<lista_coberturasdto.size();i++) {
			for(int j=0;j<examenesdto.size();j++) {
				if(examenesdto.get(j).getId_Examen() ==lista_coberturasdto.get(i).getXla_examen()) {
					examendto=examenesdto.get(j);
					for(int k=0;k<tipos_examendto.size();k++) {						
						if(tipos_examendto.get(k).getId_tipo_examen()==examenesdto.get(j).getId_tipo_examen()) {							
							tipo_examendto=tipos_examendto.get(k);
							break;
						}
					}
					break;
				}
			}
			lista_cobertura_retorno.add(crearCoberturaRetorno(lista_coberturasdto.get(i), examendto, tipo_examendto));
		}
		//fin cambio de lista
		
		plan_retorno.setCobertura(lista_cobertura_retorno);
		return plan_retorno;
	}
	
	public PlanCorto crearPlanCortoRetorno(PlanDTO plan,Tipo_planDTO tipo_plan) {
		PlanCorto planRetorno=new PlanCorto();
		planRetorno.setIdPlan(plan.getId_plan());
		planRetorno.setNombrePlan(plan.getNombre_plan()+" ("+tipo_plan.getNombre_tipo_plan()+")");
		return planRetorno;
		
	}
	
	public TipoPlan crearTipoPlanRetorno(Tipo_planDTO tipoplandto) {
		TipoPlan tipo_plan_retorno=new TipoPlan();
		tipo_plan_retorno.setIdTipoPlan(tipoplandto.getId_tipo_plan());
		tipo_plan_retorno.setNombreTipoPlan(tipoplandto.getNombre_tipo_plan());
		return tipo_plan_retorno;
	}
	
	public Cobertura crearCoberturaRetorno(CoberturaDTO coberturadto,ExamenDTO examendto,Tipo_examenDTO tipoexamendto) {
		Cobertura cobertura_retorno=new Cobertura();
		cobertura_retorno.setIdCobertura(coberturadto.getId_Cobertura());
		cobertura_retorno.setTarifa(coberturadto.getTarifa_cubierta());
		cobertura_retorno.setTiempoRespuesta(coberturadto.getTiempo_respuesta());
		cobertura_retorno.setExamen(crearExamenRetorno(examendto, tipoexamendto));
		return cobertura_retorno;
				
	}
}

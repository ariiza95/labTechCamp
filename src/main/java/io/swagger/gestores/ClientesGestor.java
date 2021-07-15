package io.swagger.gestores;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.swagger.db.daos.CitasDAOJPA;
import io.swagger.db.daos.ClientesDAOJPA;
import io.swagger.db.daos.EmpresasDAOJPA;
import io.swagger.db.daos.PlanesDAOJPA;
import io.swagger.db.daos.TiposDePlanesDAOJPA;
import io.swagger.db.daos.TiposIdentificacionDAOJPA;
import io.swagger.db.models.ClienteDTO;
import io.swagger.db.models.EmpresaDTO;
import io.swagger.db.models.PlanDTO;
import io.swagger.db.models.Tipo_identificacionDTO;
import io.swagger.db.models.Tipo_planDTO;
import io.swagger.model.Cliente;
import io.swagger.model.Fabrica_objetos_swagger;
import io.swagger.model.TipoIdentificacion;


@Service
@Transactional
public class ClientesGestor{

	@Autowired
	ClientesDAOJPA clientesdao;
	@Autowired
	TiposIdentificacionDAOJPA tiposIddao;
	@Autowired
	TiposDePlanesDAOJPA tiposPlanesdao;
	@Autowired
	PlanesDAOJPA planesdao;
	@Autowired
	EmpresasDAOJPA empresadao;
	@Autowired
	CitasDAOJPA citasdao;
	
	@Autowired
	Fabrica_objetos_swagger fabrica_retornos;
		
	
	public List<TipoIdentificacion> solicitarTodosLosTiposDeIdentificacion(){
		
		//List<TipoIdentificacion> lista=clientesdao.consultarTodosLosTiposDeIdentificacion();
		List<Tipo_identificacionDTO> lista=tiposIddao.findAll();
		List<TipoIdentificacion> retorno=new ArrayList<TipoIdentificacion>();
		for(int i=0;i<lista.size();i++) {
			retorno.add(fabrica_retornos.crearTipoIdentificacionRetorno(lista.get(i)));
		}
		return retorno;
		
	}
	
	public Cliente solicitarClienteCompleto(String numero_documento, int tipo_documento) {
		ClienteDTO clientedto=clientesdao.findByDocumento(numero_documento, tipo_documento);
		if(clientedto!=null) {
			PlanDTO plandto=planesdao.getById(clientedto.getPlan_salud());
			Optional<Tipo_planDTO> tipoplandto=tiposPlanesdao.findById(plandto.getId_tipo_plan());
			Optional<EmpresaDTO> empresadto=empresadao.findById(plandto.getId_empresa_prestadora());
			return fabrica_retornos.crearClienteRetorno(clientedto,(Tipo_planDTO)tipoplandto.get(),plandto,(EmpresaDTO)empresadto.get());
		}else {
			return null;
		}
		
		
	}
	
	public ClienteDTO solicitarClienteSencillo(String numero_documento, int tipo_documento) {
		ClienteDTO clientedto=clientesdao.findByDocumento(numero_documento, tipo_documento);
		if(clientedto!=null) {
			return clientedto;
		}else {
			return null;
		}
		
		
	}
	
	public int crear_cita_generica() {
		return citasdao.agregar_generico();
	}
	
	public void crear_cita_genericaS() {
		//clientesdao.agregar_genericoSinRetorno("12-07-2021","14:20",1,1,1,1,"7000",1);
		citasdao.agregar_genericoSinRetorno();
	}
	
	
}

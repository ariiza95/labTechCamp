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
import io.swagger.db.models.PlanDTO;
import io.swagger.db.models.Tipo_examenDTO;
import io.swagger.db.models.Tipo_identificacionDTO;
import io.swagger.db.models.Tipo_planDTO;
import io.swagger.model.Cliente;
import io.swagger.model.Cubiculo;
import io.swagger.model.Fabrica_objetos_swagger;
import io.swagger.model.TipoIdentificacion;


@Service
@Transactional
public class CubiculosGestor{

	@Autowired
	CubiculosDAOJPA cubiculosdao;
	@Autowired
	TipoExamenesDAOJPA tiposExamenesdao;	
	
	@Autowired
	Fabrica_objetos_swagger fabrica_retornos;
		
	
	public List<Cubiculo> solicitarCubiculos(){
		
		//List<TipoIdentificacion> lista=clientesdao.consultarTodosLosTiposDeIdentificacion();
		List<CubiculoDTO> lista=cubiculosdao.findAll();
		List<Cubiculo> retorno=new ArrayList<Cubiculo>();
		Optional<Tipo_examenDTO> tipo_examen;
		for(int i=0;i<lista.size();i++) {
			tipo_examen=tiposExamenesdao.findById(lista.get(i).getId_tipo_examen());
			retorno.add(fabrica_retornos.crearCubiculoRetorno(lista.get(i),tipo_examen.get()));
		}
		return retorno;
		
	}
	
	public List<Cubiculo> solicitarCubiculos(int id_examen){
		
		//List<TipoIdentificacion> lista=clientesdao.consultarTodosLosTiposDeIdentificacion();
		List<CubiculoDTO> lista=cubiculosdao.findByExamen(id_examen);
		List<Cubiculo> retorno=new ArrayList<Cubiculo>();
		Optional<Tipo_examenDTO> tipo_examen;
		for(int i=0;i<lista.size();i++) {
			tipo_examen=tiposExamenesdao.findById(lista.get(i).getId_tipo_examen());
			retorno.add(fabrica_retornos.crearCubiculoRetorno(lista.get(i),tipo_examen.get()));
		}
		return retorno;
		
	}
	
	
}

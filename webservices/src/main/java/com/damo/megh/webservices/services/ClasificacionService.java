package com.damo.megh.webservices.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.damo.megh.webservices.models.Clasificacion;
import com.damo.megh.webservices.repositories.ClasificacionDRepository;
import com.damo.megh.webservices.repositories.ClasificacionIRepository;

@Service
public class ClasificacionService implements ClasificacionIRepository{

	@Autowired
	ClasificacionDRepository drClasificacion;
	
	@Override
	public List<Map<String, Object>> MostarRegistro() {
		// TODO Auto-generated method stub
		return drClasificacion.MostarRegistro();
	}

	@Override
	public int GuardarRegistro(Clasificacion clasificacion) {
		// TODO Auto-generated method stub
		return drClasificacion.GuardarRegistro(clasificacion);
	}

	@Override
	public int EditarRegistro(Clasificacion clasificacion) {
		// TODO Auto-generated method stub
		return drClasificacion.EditarRegistro(clasificacion);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return drClasificacion.EliminarRegistro(id);
	}

}

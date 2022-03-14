package com.damo.megh.webservices.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.damo.megh.webservices.models.Nacionalidad;
import com.damo.megh.webservices.repositories.NacionalidadDRepository;
import com.damo.megh.webservices.repositories.NacionalidadIRepository;

@Service
public class NacionalidadService implements NacionalidadIRepository {

		
	@Autowired
	NacionalidadDRepository drNacionalidad;
	
	
	@Override
	public List<Map<String, Object>> MostarRegistro() {
		// TODO Auto-generated method stub
		return drNacionalidad.MostarRegistro();
	}

	@Override
	public int GuardarRegistro(Nacionalidad nacionalidad) {
		// TODO Auto-generated method stub
		return drNacionalidad.GuardarRegistro(nacionalidad);
	}

	@Override
	public int EditarRegistro(Nacionalidad nacionalidad) {
		// TODO Auto-generated method stub
		return drNacionalidad.EditarRegistro(nacionalidad);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return drNacionalidad.EliminarRegistro(id);
	}

}

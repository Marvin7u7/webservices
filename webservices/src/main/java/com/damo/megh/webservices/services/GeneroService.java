package com.damo.megh.webservices.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.damo.megh.webservices.models.Genero;
import com.damo.megh.webservices.repositories.GeneroDRepository;
import com.damo.megh.webservices.repositories.GeneroIRepository;
@Service
public class GeneroService implements GeneroIRepository{

	@Autowired
	GeneroDRepository dRGenero;
	
	@Override
	public List<Map<String, Object>> MostarRegistro() {
		// TODO Auto-generated method stub
		return dRGenero.MostarRegistro();
	}

	@Override
	public int GuardarRegistro(Genero genero) {
		// TODO Auto-generated method stub
		return dRGenero.GuardarRegistro(genero);
	}

	@Override
	public int EditarRegistro(Genero genero) {
		// TODO Auto-generated method stub
		return dRGenero.EditarRegistro(genero);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return dRGenero.EliminarRegistro(id);
	}

}

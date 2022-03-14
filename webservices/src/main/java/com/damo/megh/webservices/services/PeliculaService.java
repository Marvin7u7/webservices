package com.damo.megh.webservices.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.damo.megh.webservices.models.Pelicula;
import com.damo.megh.webservices.repositories.PeliculaDRepository;
import com.damo.megh.webservices.repositories.PeliculaIRepository;

@Service
public class PeliculaService implements PeliculaIRepository {

	@Autowired
	PeliculaDRepository drPeli;
	
	@Override
	public List<Map<String, Object>> MostarRegistro() {
		// TODO Auto-generated method stub
		return drPeli.MostarRegistro();
	}

	@Override
	public int GuardarRegistro(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return drPeli.GuardarRegistro(pelicula);
	}

	@Override
	public int EditarRegistro(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return drPeli.EditarRegistro(pelicula);
	}

	@Override
	public int EliminarRegistro(int id) {
		// TODO Auto-generated method stub
		return drPeli.EliminarRegistro(id);
	}

}

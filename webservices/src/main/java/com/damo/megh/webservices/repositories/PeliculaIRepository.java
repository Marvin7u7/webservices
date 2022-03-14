package com.damo.megh.webservices.repositories;

import java.util.List;
import java.util.Map;

import com.damo.megh.webservices.models.Pelicula;

public interface PeliculaIRepository {
	
	public List<Map<String, Object>> MostarRegistro();

	public int GuardarRegistro(Pelicula pelicula);

	public int EditarRegistro(Pelicula pelicula);

	public int EliminarRegistro(int id);
}

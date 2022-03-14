package com.damo.megh.webservices.repositories;

import java.util.List;
import java.util.Map;

import com.damo.megh.webservices.models.Idioma;

public interface IdiomaIRepository {

	public List<Map<String, Object>> MostarRegistro();

	public int GuardarRegistro(Idioma idioma);

	public int EditarRegistro(Idioma idioma);

	public int EliminarRegistro(int id);
	
}

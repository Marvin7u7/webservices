package com.damo.megh.webservices.repositories;

import java.util.Map;

import com.damo.megh.webservices.models.Genero;

import java.util.List;

public interface GeneroIRepository {

	public List<Map<String, Object>> MostarRegistro();

	public int GuardarRegistro(Genero genero);

	public int EditarRegistro(Genero genero);

	public int EliminarRegistro(int id);

}

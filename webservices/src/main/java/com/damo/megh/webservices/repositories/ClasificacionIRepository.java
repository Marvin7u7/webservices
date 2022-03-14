package com.damo.megh.webservices.repositories;

import java.util.List;
import java.util.Map;

import com.damo.megh.webservices.models.Clasificacion;


public interface ClasificacionIRepository {

	public List<Map<String, Object>> MostarRegistro();

	public int GuardarRegistro(Clasificacion clasificacion);

	public int EditarRegistro(Clasificacion clasificacion);

	public int EliminarRegistro(int id);
}

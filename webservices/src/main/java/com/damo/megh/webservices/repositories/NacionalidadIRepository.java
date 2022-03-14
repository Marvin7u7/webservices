package com.damo.megh.webservices.repositories;

import java.util.List;
import java.util.Map;

import com.damo.megh.webservices.models.Nacionalidad;

public interface NacionalidadIRepository {

	public List<Map<String, Object>> MostarRegistro();

	public int GuardarRegistro(Nacionalidad nacionalidad);

	public int EditarRegistro(Nacionalidad nacionalidad);

	public int EliminarRegistro(int id);
	
}

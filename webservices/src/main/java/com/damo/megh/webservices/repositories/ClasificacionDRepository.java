package com.damo.megh.webservices.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.damo.megh.webservices.models.Clasificacion;
@Repository
public class ClasificacionDRepository implements ClasificacionIRepository{

	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<Map<String, Object>> MostarRegistro() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> lista = template.queryForList("Select * from Clasificacion");
		return lista;
	}

	@Override
	public int GuardarRegistro(Clasificacion clasificacion) {
		// TODO Auto-generated method stub
		int b = 0;
		b = template.update("INSERT INTO Clasificacion (abreviacion,nombre,activo) values (?,?,?)",
				new Object[] {clasificacion.getAbreviacion(),clasificacion.getNombre(),clasificacion.isActivo()});
		return b;
	}

	@Override
	public int EditarRegistro(Clasificacion clasificacion) {
		// TODO Auto-generated method stub
		int b = 0;
		b = template.update("Update Clasificacion SET abreviacion = ?,nombre = ?, activo = ? where idClasificacion = ?",
				new Object[] {clasificacion.getAbreviacion(),clasificacion.getNombre(),clasificacion.getIdClasificacion()});
		return b;
	}

	@Override
	public int EliminarRegistro(int id) {
		int b = 0;
		b = template.update("DELETE FROM Clasificacion WHERE idClasificacion = ?", id);
		return b;
	}

}

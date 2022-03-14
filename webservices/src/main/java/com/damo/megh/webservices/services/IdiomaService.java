package com.damo.megh.webservices.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.damo.megh.webservices.models.Idioma;
import com.damo.megh.webservices.repositories.IdiomaDRepository;
import com.damo.megh.webservices.repositories.IdiomaIRepository;

@Service
public class IdiomaService implements IdiomaIRepository {

	@Autowired
	IdiomaDRepository drIdioma;
	
	@Override
	public List<Map<String, Object>> MostarRegistro() {
		// TODO Auto-generated method stub
		return drIdioma.MostarRegistro();
	}

	@Override
	public int GuardarRegistro(Idioma idioma) {
		// TODO Auto-generated method stub
		return drIdioma.GuardarRegistro(idioma);
	}

	@Override
	public int EditarRegistro(Idioma idioma) {
		// TODO Auto-generated method stub
		return drIdioma.EditarRegistro(idioma);
	}

	@Override
	public int EliminarRegistro(int id) {
		return drIdioma.EliminarRegistro(id);
	}

}

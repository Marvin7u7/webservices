package com.damo.megh.webservices.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.damo.megh.webservices.models.Idioma;
import com.damo.megh.webservices.services.IdiomaService;

@RestController
@RequestMapping(path = "/idioma")
public class IdiomaController {

	@Autowired
	IdiomaService idoservice;

	@GetMapping("/listar")
	public List<Map<String, Object>> listar() {
		return idoservice.MostarRegistro();
	}

	@PostMapping("/agregar")
	public String agregarIdioma(@RequestBody Idioma idioma) {
		String msg = "Error al guardar registro.....";
		int b = idoservice.GuardarRegistro(idioma);
		if (b == 1)
			msg = "Guardado Exitosamente ....";
		return msg;
	}

	@PutMapping("/actualizar/{id}")
	public String editarIdioma(@RequestBody Idioma idioma, @PathVariable int id, Model model) {
		String msg = "ERROR AL ACTUALIZAR EL REGISTRO....";
		int b = idoservice.EditarRegistro(idioma);
		if (b == 1)
			msg = "Actualizado Correctamente !";
		return msg;
	}

	@DeleteMapping("/eliminar/{id}")
	public String eliminarIdioma(@PathVariable int id, Model model) {
		String msg = "Error al eliminar el registro ...";
		int b = idoservice.EliminarRegistro(id);
		if (b == 1)
			msg = "SE ELIMINO CORRECTAMENTE !";
		return msg;
	}
}

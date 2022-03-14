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

import com.damo.megh.webservices.models.Clasificacion;
import com.damo.megh.webservices.services.ClasificacionService;

@RestController
@RequestMapping(path = "/clasificacion")
public class ClasificacionController {

	@Autowired
	ClasificacionService claservice;
	
	@GetMapping("/listar")
	public List<Map<String, Object>> listar() {
		return claservice.MostarRegistro();
	}

	@PostMapping("/agregar")
	public String agregarCla(@RequestBody Clasificacion clasificacion) {
		String msg="Error al guardar registro.....";
		int b = claservice.GuardarRegistro(clasificacion);
		if(b==1)msg="Guardado Exitosamente ....";
		return msg;
	}
	
	@PutMapping("/actualizar/{id}")
	public String editarCla(@RequestBody Clasificacion clasificacion, @PathVariable int id, Model model) {
		String msg = "ERROR AL ACTUALIZAR EL REGISTRO....";
		int b = claservice.EditarRegistro(clasificacion);
		if(b==1)msg= "Actualizado Correctamente !";
		return msg;
	} 
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminarCla(@PathVariable int id, Model model){
		String msg = "Error al eliminar el registro ...";
		int b = claservice.EliminarRegistro(id);
		if(b==1)msg = "SE ELIMINO CORRECTAMENTE !";
		return msg;
	}
	
}

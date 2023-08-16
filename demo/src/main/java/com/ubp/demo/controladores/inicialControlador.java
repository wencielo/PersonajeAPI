package com.ubp.demo.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ubp.demo.dto.PersonajeDTO;
import com.ubp.demo.services.PersonajeServicio;

@RestController
@RequestMapping("/apiV1/inicial") 
public class inicialControlador {
	
	@Autowired
	PersonajeServicio personajeServicio;
	
	@GetMapping
	public ResponseEntity<List<PersonajeDTO>> traerPersonajes(){
		//tomar los datos de la api ext
		return new ResponseEntity<> (personajeServicio.obtenerPersonajes(), HttpStatus.OK);
	}
}

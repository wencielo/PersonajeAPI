package com.ubp.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ubp.demo.dto.PersonajeDTO;
import com.ubp.demo.dto.PersonajeRespuestaDTO;
import com.ubp.demo.services.PersonajeServicio;

@RestController
@RequestMapping("/apiV1/personaje") 
public class PersonajeControlador {		
	
	@Autowired //Inyectamos el servicio
	PersonajeServicio personajeServicio; 	
	
	@GetMapping
	public PersonajeRespuestaDTO obtenerTodosLosPersonajes( 	
			@RequestParam(value="PagNo", defaultValue="0", required=false)int numeroDePagina,
			@RequestParam(value="PageSize", defaultValue="20",required=false)int tamañoPagina){
		
		return personajeServicio.listarPersonajes(numeroDePagina,tamañoPagina);				
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PersonajeDTO> obtenerPersonajePorId(@PathVariable(name= "id")Integer id){
		return new ResponseEntity<>(personajeServicio.buscarPersonajePorId(id), HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping
	public ResponseEntity<PersonajeDTO> guardar(@RequestBody PersonajeDTO PersonajeDto){
		return new ResponseEntity<>(personajeServicio.crearPersonaje(PersonajeDto), HttpStatus.CREATED);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/{id}")
	public ResponseEntity<PersonajeDTO> actualizar(@RequestBody PersonajeDTO PersonajeDto,
			@PathVariable(name="id")Integer Id){
		PersonajeDTO personajeRespuesta = personajeServicio.actualizarPersonaje(PersonajeDto, Id);
		return new ResponseEntity<>(personajeRespuesta, HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/{id}")
	public ResponseEntity<String> eliminarPersonaje(@PathVariable(name= "id")Integer id){
		personajeServicio.eliminarPersonaje(id);
		return new ResponseEntity<>("Personaje eliminado correctamente", HttpStatus.OK);
	}
}
